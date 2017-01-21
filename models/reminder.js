'use strict'
var mongoose = require('mongoose');

var reminderSchema = new mongoose.Schema({
  name:String,
  time:String,
  status:Boolean,
  userID:Number
});

var model = mongoose.model('Reminder', reminderSchema);

module.exports = model;
