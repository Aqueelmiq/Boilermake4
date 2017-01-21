'use strict'
var express = require('express');
var router = express.Router();
var user = require('../models/user.js');
var notification = require('../models/notification.js');
var reminder = require('../models/reminder.js');

/* GET home page. */
router.get('/reminder', function(req, res) {
  reminder.find({}, retrieveReminder);
});

router.post('/reminder', function(req, res) {
  var reminder = req.body;
  reminder.create(reminder, function(err,reminder){
    res.json("save":save);
  });
});

var createReminder =function(message,time){
  //saves the reminder and the alarm to databse


};

var retrieveReminder =function(err,reminders){
  res.json({'reminders': reminders});
};

function completeReminder(reminderID){
    //marks as complete

};
function cancelReminder(reminderID){
  //deletes reminder

};

function pushNotification(reminder, users){
  //when system clock = time display message

};

function receiveNotification(reminder, sender){
  //when system clock = time display message

};

function addFriend(sender,reciever){
  //when system clock = time display message

};
function removeFriend(sender,reciever){
  //when system clock = time display message

};


module.exports = router;
