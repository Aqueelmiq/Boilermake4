'use strict'
var mongoose = require('mongoose');

var reminderSchema = new mongoose.Schema({
  name:String,
  time:String,
  status: {type: Boolean, default:true},
  userID:String
});

var model = mongoose.model('Reminder', reminderSchema);

module.exports = model;
