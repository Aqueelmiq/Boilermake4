'use strict'

var express = require('express');
var router = express.Router();
var User = require('../models/user');
var Notify = require('../models/notify');
var Reminder = require('../models/reminder');
var Hi = require('../models/hi');

/* GET home page. */

router.get('/reminder', function(req, res) {
  Reminder.find({}, function(err,reminders){
    res.json({'reminders': reminders});
  });
});

router.get('/user/:id', function(req, res) {
  User.find({id:req.params.id}, function(err,user){
    res.json({'reminder': user.reminderList});
  });
});
/*
//end new changes
router.post('/reminder', function(req, res) {
  var reminder = req.body;
  Reminder.create(reminder, function(err, reminder){
    res.json({"save": "Done"});
  });
});
*/
router.post('/hello', function(req, res) {
  var hi = req.body;
  Hi.create(hi, function(err,reminder){
    res.json({"save": "Done"});
  });
});


var createReminder = function(message,time){
  //saves the reminder and the alarm to databse
  var newReminder ={
    name:message,
    time:time,
    status:true
  }
  Reminder.create(newReminder, function(err, returnedReminder){
    console.log("Reminder Created");
    User.find({id:returnedReminder.id}, function(err,user){
        user.reminderList.push(returnedReminder.id);
        User.create(user, function(err, returnedUser){});
    });
  });

};

function completeReminder(reminderID){
    //marks as complete
  Reminder.find({id:reminderID}, function(err,returnedReminder){
      returnedRemider.status=false;
      console.log("Reminder Completed");
      Reminder.create(returnedRemider, function(err, returnedUser){console.log("complete reminder called");});
    });
};


function cancelReminder(reminderID){
  //deletes reminder
  Reminder.delete({id:reminderID}, function(err,returnedReminder) {
    User.find({id:returnedReminder.userID},function(err,user){
       user.reminderList.delete(returnedReminder.id)
    });
  });
};

/*
function pushNotification(reminder, users){
  //when system clock = time display message

};

function receiveNotification(reminder, sender){
  //when system clock = time display message

};

function addFriend(sender){
  //when system clock = time display message

};
function removeFriend(sender){
  //when system clock = time display message

};
*/

module.exports = router;
