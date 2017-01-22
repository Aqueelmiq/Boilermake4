'use strict'

var mongoose = require('mongoose');

var notificationSchema = new mongoose.Schema({
  title:String,
  time:String,
  reminderID:String
});

var model = mongoose.model('Notify', notificationSchema);

module.exports = model;
