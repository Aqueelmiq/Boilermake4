'use strict'

var mongoose = require('mongoose');

mongoose.connect('mongodb://localhost/project_one', function (err) {
  if(err) {
      console.log("Fail");
  }
  else {
      console.log("Connected");
  }
});
