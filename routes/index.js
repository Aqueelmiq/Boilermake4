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

router.post('/reminder', function(req, res) {
  var reminder = req.body;
  Reminder.create(reminder, function(err, reminder){
    res.json({"save": "Done"});
  });
});

router.post('/hello', function(req, res) {
  var hi = req.body;
  Hi.create(hi, function(err,reminder){
    res.json({"save": "Done"});
  });
});

/*
var createReminder = function(message,time){
  //saves the reminder and the alarm to databse


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
*/

module.exports = router;
