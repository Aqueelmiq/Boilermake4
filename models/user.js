'use strict'

var mongoose = require('mongoose');
var userSchema = new mongoose.Schema({
  userName:String,
  password:String,
  name:String,
  friendsList:Array,
  reminderList:Array,
  notificationList:Array
});

var model = mongoose.model('user', userSchema);
module.exports = model;
