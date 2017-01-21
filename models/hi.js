'use strict'

var mongoose = require('mongoose');

var hi = new mongoose.Schema({
  msg:String
});

var model = mongoose.model('Hi', hi);

module.exports = model;
