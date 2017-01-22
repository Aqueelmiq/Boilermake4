'use strict'

var mongoose = require('mongoose');
var userSchema = new mongoose.Schema({
  name:String,
  friendsList: {type: Array, default: []},
  reminderList: {type: Array, default: []},
  notificationList: {type: Array, default: []}
});

var model = mongoose.model('user', userSchema);
module.exports = model;
