'use strict'
var mongoose = require('mongoose');
var reminderSchema = new mongoose.Schema({
  reminderName:String,
  reminderTime:Date,
  reminderStatus:Boolean,
});

var model = mongoose.model('reminder',reminderSchema);
module.exports = model;
