'use strict'
var mongoose = require('mongoose');
var notificationSchema = new mongoose.Schema({
  notificationTitle:String,
  notificationTime:Date,
  
});

var model = mongoose.model('notification',notificationSchema);
module.exports = model;
