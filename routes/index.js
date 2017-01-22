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

router.get('/user', function(req, res) {
  User.find({}, function(err,users){
    res.json({'users': users});
  });
});

router.get('/user/:id', function(req, res) {
  User.findOne({_id:req.params.id}, function(err, user){
    res.json({'user': user});
  });
});

router.post('/users', function(req, res) {
  var user = req.body;
  User.create(user, function(err,user){
    res.json({'user': user});
  });
});

router.post('/users/:id/reminder', function(req, res) {
  var reminder = req.body;
  reminder.userID = req.params.id;
  Reminder.create(reminder, function(err, rRem){
    User.findOne({_id:req.params.id}, function(err, rUser){
        rUser.reminderList.push(rRem._id);
        rUser.save(function(err, updated){
          res.json("Reminder "+rRem.name+" Created for " + rUser.name);
        })
    });
  });
});

router.put('/reminder/complete/:rid', function(req, res) {
  var reminder = req.body;
  Reminder.findById(req.params.rid, function(err, returnedReminder){
      returnedReminder.status=false;
      returnedReminder.save(function(err, updated) {
        res.json("Reminder "+updated.name+" completed");
      });
    });
});

router.delete('/reminder/complete/:rid', function(req, res) {
  var reminder = req.body;
  Reminder.delete({_id:req.params.rid}, function(err,returnedReminder) {
    User.find({_id:returnedReminder.userID},function(err,returnedUser){
       returnedUser.reminderList.splice(returnedUser.reminderList.indexOf(req.params.id));
       returnedUser.save(function(err) {
         res.json("Reminder ID"+ reminderID +"cancelled");
       });
    });
  });
});

router.post('/users/:id/friends/:fid', function(req, res) {
  var reminder = req.body;
  var senderID = req.params.id;
  var recieverID = req.params.fid;
  User.findOne({_id:senderID}, function(err,returnedUser){

     returnedUser.friendsList.push(recieverID);
     returnedUser.save(function(err) {
       User.findOne({_id:recieverID}, function(err,returnedUser2){
        returnedUser2.friendsList.push(senderID);
         returnedUser2.save(function(err, updated) {
           res.json("Friend "+ returnedUser2.userName +" added to reciever " + "Friend "+ returnedUser.userName +" added to sender");
         });
       });
     });
  });

});

router.delete('/users/:id/friends/:fid', function(req, res) {
  var reminder = req.body;
  var senderID = req.params.id;
  var recieverID = req.params.fid;
  User.findOne({_id:senderID}, function(err,returnedUser){

     returnedUser.friendsList = returnedUser.friendsList.filter(item => item !== recieverID);
     returnedUser.save(function(err, updated) {
       User.findOne({_id:recieverID}, function(err,returnedUser2){
         returnedUser2.friendsList = returnedUser2.friendsList.filter(item => item !== senderID);
         returnedUser2.save(function(err, updated) {
           res.json("Friend "+ returnedUser2.name +" removed from reciever\n" + "Friend "+ returnedUser.name +" removed from sender");
         });
       });
     });
  });

});

//5883ba7984ee5c093ccdba3f
//5883ba7d84ee5c093ccdba40

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
    console.log("User "+ newUser.userName +" Created");
    });

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
    User.find({_id:returnedReminder.userID}, function(err, returnedUser){
        console.log(returnedReminder);
        User.update({}, returnedUser, function(err) {});
        //User.update(user, function(err, returnedUser){});
        console.log("Reminder "+returnedReminder.name+" Created for " + returnedUser.userName);
    });
  });

};

function completeReminder(reminderID){
    //marks as complete
  Reminder.find({_id:reminderID}, function(err,returnedReminder){
      returnedReminder.status=false;
      returnedReminder.save(function(err) {
        console.log("Reminder "+returnedReminder.name+" completed");
      });
    });
};

//05LZ6XgDasNq2Peq


function cancelReminder(reminderID){
  //deletes reminder
  Reminder.delete({_id:reminderID}, function(err,returnedReminder) {
    User.find({_id:reminderID},function(err,returnedUser){
       returnedUser.reminderList.delete(reminderID);
       returnedUser.save(function(err) {
         console.log("Reminder ID"+ reminderID +"cancelled");
       });
    });
  });
};

function addFriend(senderID, recieverID){
   User.find({_id:senderID}, function(err,returnedUser){
      returnedUser.friendsList.push(recieverID);
      returnedUser.save(function(err) {
        console.log("Friend "+ returnedUser.userName +" added to sender");
      });
   });
   User.find({_id:recieverID}, function(err,returnedUser2){
     returnedUser2.friendsList.push(senderID);
     returnedUser2.save(function(err) {
       console.log("Friend "+ returnedUser2.userName +" added to reciever");
     });
   });
};

function removeFriend(senderID, recieverID){

  User.find({_id:senderID}, function(err,returnedUser){

     returnedUser.friendsList = returnedUser.friendsList.filter(item => item !== recieverID);
     returnedUser.save(function(err) {
       console.log("Friend "+ returnedUser.userName +" removed from sender");
     });
  });
  User.find({_id:recieverID}, function(err,returnedUser2){
    returnedUser2.friendsList = returnedUser2.friendsList.filter(item => item !== recieverID);
    returnedUser2.save(function(err) {
      console.log("Friend "+ returnedUser2.userName +" removed from reciever");
    });
  });

};

function addNotification(remID, senderID, recieverID){
  Reminder.find({_id: remID}, function(reminder, err) {
    createReminder(reminder.name, reminder.time, recieverID);
    console.log(senderID +" created a reminder for "+ recieverID);
  });

};

module.exports = router;
