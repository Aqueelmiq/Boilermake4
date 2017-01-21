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
  console.log("User "+ newUser.userName +" Created");
};


var createReminder = function(i_message,i_time,reqID){
  //saves the reminder and the alarm to databse
  var newReminder ={
    name:i_message,
    time:i_time,
    status:true,
    userID:reqID
  }
  Reminder.create(newReminder, function(err, returnedReminder){
    User.find({id:returnedReminder.id}, function(err,returnedUser){
        returnedUser.reminderList.push(returnedReminder.id);
        User.create(user, function(err, returnedUser){});
        console.log("Reminder "+returnedReminder.name+" Created for " + returnedUser.userName);
    });
  });

};

function completeReminder(reminderID){
    //marks as complete
  Reminder.find({id:reminderID}, function(err,returnedReminder){
      returnedReminder.status=false;
      Reminder.create(returnedReminder, function(err, returnedUser){
        console.log("Reminder "+returnedReminder.name+" completed");
      });
    });
};


function cancelReminder(reminderID){
  //deletes reminder
  Reminder.delete({id:reminderID}, function(err,returnedReminder) {
    User.find({id:reminderID},function(err,returnedUser){
       returnedUser.reminderList.delete(reminderID);
       console.log("Reminder ID"+ reminderID +"cancelled");
    });
  });
};

function addFriend(senderID, recieverID){
   User.find({id:senderID}, function(err,returnedUser){
      returnedUser.friendsList.push(recieverID);
      User.create(returnedUser, function(err, returnedUser){});
      console.log("Friend "+ returnedUser.userName +" added to sender");
        User.find({id:recieverID}, function(err,returnedUser2){
          returnedUser2.friendsList.push(senderID);
          User.create(returnedUser2user, function(err, returnedUser2){});
          console.log("Friend "+ returnedUser2.userName +" added to reciever");
        });
   };
};

function removeFriend(senderID, recieverID){
  User.find({id:senderID}, function(err,returnedUser){
     returnedUser.friendsList.delte(recieverID);
     User.create(returnedUser, function(err, returnedUser){});
     console.log("Friend "+ returnedUser.userName +" removed from sender");
       User.find({id:recieverID}, function(err,returnedUser2){
         returnedUser2.friendsList.delete(senderID);
         User.create(returnedUser2user, function(err, returnedUser2){});
         console.log("Friend  "+ returnedUser2.userName +" deleted from reciever");
       });
  };

};


function addNotification(notifyReminder, senderID, recieverID){
  //when system clock = time display message
  createReminder(notifyReminder.name,notifyReminder.time,recieverID);
  console.log(senderID +" created a reminder for "+ recieverID);

};

module.exports = router;
