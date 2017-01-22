<%-- 
    Document   : home
    Created on : Jan 21, 2017, 12:39:21 AM
    Author     : ACHAL LATHIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Advance Alexa </title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
        
</head>

<body>
	<div id="header">

            <a href="home.jsp"><img style="max-height: 99%; max-width: 99%;" class="fit" src="rmind.png" alt="Logo"></a>
	</div>
	<div id="body">
		<div>
			<ul id="navigation">
				<li class="current">
                                    <a href="home.jsp" class="link1">Home</a>
				</li>
				<li>
                                    <a href="Notifications.jsp" class="link2">Notifications</a>
				</li>
				<li>
                                    <a href="Add Friends.jsp" class="link1">Friends</a>
				</li>
				<li>
                                    <a href="calendar.jsp" class="link2">Calendar</a>
				</li>
				<li>
					<a href="contact.html" class="link1">Contact</a>
				</li>
			</ul>
			<div id="home">
                            <script>
        // request permission on page load
document.addEventListener('DOMContentLoaded', function () {
  if (Notification.permission !== "granted")
    Notification.requestPermission();
});

function notifyMe() {
  if (!Notification) {
    alert('Desktop notifications not available in your browser. Try Chromium.'); 
    return;
  }

  if (Notification.permission !== "granted")
    Notification.requestPermission();
  else {
    var notification = new Notification('Reminder Set ', {
      icon: 'http://cdn.sstatic.net/stackexchange/img/logos/so/so-icon.png',
      body: "Hey there! You will be notified!",
    });

    notification.onclick = function () {
      window.open("http://stackoverflow.com/a/13328397/1269037");      
    };
    
  }

}

</script>
<!--                            	<h1><span>rmind</span></h1>-->
                                <h2 style="color: black">Hi, how are you doing today? How can I help you?..!!!!</h2>
                                
                                <!-- CSS Styles -->
<style>
  .speech {border: 1px solid #DDD; width: 300px; padding: 0; margin: 0}
  .speech input {border: 0; width: 240px; display: inline-block; height: 30px;}
  .speech img {float: right; width: 40px }
</style>

<!-- Search Form -->
<form id="labnol" method="get"  onsubmit="notifyMe()" action="https://www.google.com/search">
  <div class="speech">
    <input type="text" name="q" id="transcript" placeholder="Speak" />
    <img onclick="startDictation()" src="//i.imgur.com/cHidSVu.gif" />
  </div>
   
</form>

<!-- HTML5 Speech Recognition API -->
<script>
  function startDictation() {

    if (window.hasOwnProperty('webkitSpeechRecognition')) {

      var recognition = new webkitSpeechRecognition();

      recognition.continuous = false;
      recognition.interimResults = false;

      recognition.lang = "en-US";
      recognition.start();

      recognition.onresult = function(e) {
        document.getElementById('transcript').value
                                 = e.results[0][0].transcript;
        recognition.stop();
        document.getElementById('labnol').submit();
      };

      recognition.onerror = function(e) {
        recognition.stop();
      }

    }
  }
</script>
				
			</div>
		</div>
	</div>
	<div id="footer">
		<div>
			<div id="newsletter">
				<h3>Newsletter</h3>
                                <p style="color: black">
					Subscribe to our news letter.
				</p>
				<form action="index.html">
					<input type="text" value="email address" onblur="this.value=!this.value?'email address':this.value;" onfocus="this.select()" onclick="this.value='';">
				</form>
			</div>
			<div id="connect">
				<h3>Social</h3>
				<a href=" " id="facebook" target="_blank">Facebook</a>
				<a href="" id="twitter" target="_blank">Twitter</a>
				<a href=" " id="googleplus" target="_blank">Google&#43;</a>
			</div>
		</div>
		<p>
			&copy; Copyright 2023. All rights reserved.
		</p>
	</div>
</body>
</html>