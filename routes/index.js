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


var createUser = function(i_userName,i_password,i_name){
  //saves the reminder and the alarm to databsei
  var newUser ={
    userName:i_userName,
    password:i_password,
    name:i_name,
    friendsList:[],
    reminderList:[],
    notificationList:[]
  }
  User.create(newUser, function(err, newUser){
    });
  };


var createReminder = function(message,time){
  //saves the reminder and the alarm to databse
  var newReminder ={
    name:message,
    time:time,
    status:true
  }
  Reminder.create(newReminder, function(err, returnedReminder){
    User.find({id:returnedReminder.id}, function(err,returnedUser){
        returnedUser.reminderList.push(returnedReminder.id);
        User.create(user, function(err, returnedUser){});
        console.log("Reminder Created");
    });
  });

};

function completeReminder(reminderID){
    //marks as complete
  Reminder.find({id:reminderID}, function(err,returnedReminder){
      returnedRemider.status=false;
      Reminder.create(returnedRemider, function(err, returnedUser){
        console.log("complete reminder called");
      });
    });
};


function cancelReminder(reminderID){
  //deletes reminder
  Reminder.delete({id:reminderID}, function(err,returnedReminder) {
    User.find({id:returnedReminder.userID},function(err,returnedUser){
       returnedUser.reminderList.delete(returnedReminder.id);
       console.log("Reminder cancelled");
    });
  });
};

function addFriend(senderID, recieverID){
   User.find({id:senderID}, function(err,returnedUser){
      returnedUser.friendsList.push(recieverID);
      User.create(returnedUser, function(err, returnedUser){});
      console.log("Friend Added to sender");
        User.find({id:recieverID}, function(err,returnedUser2){
          returnedUser2.friendsList.push(senderID);
          User.create(returnedUser2user, function(err, returnedUser2){});
          console.log("Friend Added to reciever");
        });
   };
};

function removeFriend(senderID, recieverID){
  User.find({id:senderID}, function(err,returnedUser){
     returnedUser.friendsList.delte(recieverID);
     User.create(returnedUser, function(err, returnedUser){});
     console.log("Friend removed from sender");
       User.find({id:recieverID}, function(err,returnedUser2){
         returnedUser2.friendsList.delete(senderID);
         User.create(returnedUser2user, function(err, returnedUser2){});
         console.log("Friend deleted from reciever");
       });
  };

};
/*
function addNotification(reminder, users){
  //when system clock = time display message

};

function receiveNotification(reminder, sender){
  //when system clock = time display message

};



*/

module.exports = router;
