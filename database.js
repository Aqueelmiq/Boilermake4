'use strict'

var mongoose = require('mongoose');

mongoose.connect('mongodb://localhost/Hack', function (err) {
  if(err) {
      console.log("Fail");
  }
  else {
      console.log("Connected");
  }
});
