<%-- 
    Document   : calendar
    Created on : Jan 21, 2017, 2:37:50 PM
    Author     : ACHAL LATHIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Advance Alexa </title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
<!-- Custom Theme files -->
<link href="css/clockstyle.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<script src="js/jquery-1.11.1.min.js"></script>
<link href='//fonts.googleapis.com/css?family=Maven+Pro:700,400' rel='stylesheet' type='text/css'>
<!--//theme-style-->
 <!--Calender-->
	  <link rel="stylesheet" href="css/clndr.css" type="text/css" />
	  <script src="js/underscore-min.js"></script>
	  <script src= "js/moment-2.2.1.js"></script>
	  <script src="js/clndr.js"></script>
	  <script src="js/site.js"></script>
	<!--End Calender-->
	<script src="js/jClocksGMT.js"></script>
<script src="js/jquery.rotate.js"></script>
<link rel="stylesheet" href="css/jClocksGMT.css">
<script>
            $(document).ready(function(){
                $('#clock_hou').jClocksGMT({offset: '-5', hour24: true});
                $('#clock_dc').jClocksGMT({offset: '-4', digital: false});
                $('#clock_india').jClocksGMT({offset: '+5.5'});
            });
</script>
<!---Google Analytics Designmaz.net-->
<script>(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');ga('create', 'UA-35751449-15', 'auto');ga('send', 'pageview');</script>
  	
</head>
<body>
    
    <div id="header">

        <a href="home.jsp"><img style="max-height: 99%; max-width: 99%;" class="fit" src="rmind.png" alt="Logo"></a>
	</div>
    
    <div id="body" style="width: 30%; float:left" class="table-responsive">
        <div style="width: 80%;float: left" class="table-responsive" >
			<ul id="navigation">
				<li>
                                    <a href="home.jsp" class="link1">Home</a>
				</li>
				<li>
                                    <a href="Notifications.jsp" class="link2">Notifications</a>
				</li>
				<li>
                                    <a href="Add Friends.jsp" class="link1">Friends</a>
				</li>
				<li class="current">
                                    <a href="calendar.jsp" class="link2">Calendar</a>
				</li>
				<li>
					<a href="contact.html" class="link1">Contact</a>
				</li>
			</ul>
                    
                    
			
		</div>
	</div>
    
    <!--<h3 style="text-align: center">Your Reminder and alarms</h3>-->
        <div class="main" style="width: 70%; float:right" >
		    <div class="cloc">
					<div id="clock_india" class="clock_container">            
						<div class="digital">
							<span class="hr"></span><span class="minute"></span> <span class="period"></span>
						</div>
						<div class="clockHolder">
							<div class="rotatingWrapper"><img class="hour" src="images/clock_hour.png" alt=""/></div>
							<div class="rotatingWrapper"><img class="min" src="images/clock_min.png" alt=""/></div>
							<div class="rotatingWrapper"><img class="sec" src="images/clock_sec.png" alt=""/></div>
							<img class="clock" src="images/clock.png" alt=""/> 
						</div>             
					</div>
					</div>
					 <div class="mini-cal">
			<div class="calender">
					<div class="column_right_grid calender">
                      <div class="cal1"><div class="clndr"><div class="clndr-controls"><div class="clndr-control-button"><p class="clndr-previous-button">previous</p></div><div class="month">September 2015</div><div class="clndr-control-button rightalign"><p class="clndr-next-button">next</p></div></div><table class="clndr-table" border="0" cellspacing="0" cellpadding="0"><thead><tr class="header-days"><td class="header-day">S</td><td class="header-day">M</td><td class="header-day">T</td><td class="header-day">W</td><td class="header-day">T</td><td class="header-day">F</td><td class="header-day">S</td></tr></thead><tbody><tr><td class="day past adjacent-month last-month calendar-day-2015-08-30"><div class="day-contents">30</div></td><td class="day past adjacent-month last-month calendar-day-2015-08-31"><div class="day-contents">31</div></td><td class="day past calendar-day-2015-09-01"><div class="day-contents">1</div></td><td class="day past calendar-day-2015-09-02"><div class="day-contents">2</div></td><td class="day past calendar-day-2015-09-03"><div class="day-contents">3</div></td><td class="day past calendar-day-2015-09-04"><div class="day-contents">4</div></td><td class="day past calendar-day-2015-09-05"><div class="day-contents">5</div></td></tr><tr><td class="day past calendar-day-2015-09-06"><div class="day-contents">6</div></td><td class="day past calendar-day-2015-09-07"><div class="day-contents">7</div></td><td class="day past calendar-day-2015-09-08"><div class="day-contents">8</div></td><td class="day past calendar-day-2015-09-09"><div class="day-contents">9</div></td><td class="day past event calendar-day-2015-09-10"><div class="day-contents">10</div></td><td class="day past event calendar-day-2015-09-11"><div class="day-contents">11</div></td><td class="day past event calendar-day-2015-09-12"><div class="day-contents">12</div></td></tr><tr><td class="day past event calendar-day-2015-09-13"><div class="day-contents">13</div></td><td class="day past event calendar-day-2015-09-14"><div class="day-contents">14</div></td><td class="day past calendar-day-2015-09-15"><div class="day-contents">15</div></td><td class="day past calendar-day-2015-09-16"><div class="day-contents">16</div></td><td class="day past calendar-day-2015-09-17"><div class="day-contents">17</div></td><td class="day past calendar-day-2015-09-18"><div class="day-contents">18</div></td><td class="day past calendar-day-2015-09-19"><div class="day-contents">19</div></td></tr><tr><td class="day past calendar-day-2015-09-20"><div class="day-contents">20</div></td><td class="day past event calendar-day-2015-09-21"><div class="day-contents">21</div></td><td class="day past event calendar-day-2015-09-22"><div class="day-contents">22</div></td><td class="day past event calendar-day-2015-09-23"><div class="day-contents">23</div></td><td class="day past calendar-day-2015-09-24"><div class="day-contents">24</div></td><td class="day past calendar-day-2015-09-25"><div class="day-contents">25</div></td><td class="day today calendar-day-2015-09-26"><div class="day-contents">26</div></td></tr><tr><td class="day calendar-day-2015-09-27"><div class="day-contents">27</div></td><td class="day calendar-day-2015-09-28"><div class="day-contents">28</div></td><td class="day calendar-day-2015-09-29"><div class="day-contents">29</div></td><td class="day calendar-day-2015-09-30"><div class="day-contents">30</div></td><td class="day adjacent-month next-month calendar-day-2015-10-01"><div class="day-contents">1</div></td><td class="day adjacent-month next-month calendar-day-2015-10-02"><div class="day-contents">2</div></td><td class="day adjacent-month next-month calendar-day-2015-10-03"><div class="day-contents">3</div></td></tr></tbody></table></div></div>
				    </div>
					<div class="cal-pos a">
						<ul>
							<li></li>
							<li></li>
						</ul>
					</div>
					<div class="cal-pos">
						<ul>
							<li></li>
							<li></li>
						</ul>
					</div>
			</div>
		</div>
		<div class="clear"></div>
	</div>
		<div class="clear"></div>
		<!--End Calender-->
<div class="copy-right">
		 
</div>
</body>
</html>
