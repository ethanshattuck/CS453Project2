<?php 

  //get number of students from GET request
  $numStudents = (int)$_REQUEST["numStudents"];
  
  //get class number from GET request
  $classNumber = (int)$_REQUEST["classNumber"];
  
  //create array to store all student data
  $studentData = array();
  
  //create variable if key exists in Request data
  if(isset($_REQUEST["student1"])) {
	$student1data = $_REQUEST["student1"];
	
	//push data to studentData array
	array_push($studentData, $student1data);
  }
  
  //create variable if key exists in Request data
  if(isset($_REQUEST["student2"])) {
	$student2data = $_REQUEST["student2"];
	
	//push data to studentData array
	array_push($studentData, $student2data);
  }
  
  //create variable if key exists in Request data
  if(isset($_REQUEST["student3"])) {
	$student3data = $_REQUEST["student3"];
	
	//push data to studentData array
	array_push($studentData, $student3data);
  }
  
  //create variable if key exists in Request data
  if(isset($_REQUEST["student4"])) {
	$student4data = $_REQUEST["student4"];
	
	//push data to studentData array
	array_push($studentData, $student4data);
  }
  
  //create variable if key exists in Request data
  if(isset($_REQUEST["student5"])) {
	$student5data = $_REQUEST["student5"];
	
	//push data to studentData array
	array_push($studentData, $student5data);
  }
  
  //create variable if key exists in Request data
  if(isset($_REQUEST["teacher"])) {
	$teacherdata = $_REQUEST["teacher"];
  }
  
  //example data for student line: 0000000 or 1000300
  
  //create empty return string
  $returnStr = "";
  
  //NOTE on format of each line of returnStr:
  //Each line ends with a semicolon
  //Each line consists of three sections separated by a colon
  //Section 1: id, Section 2: text to be inserted into element, Section 3: Alert message

  //seat each student and teacher in class
  for ($x = 1; $x <= $numStudents; $x++) {
	  $seat = $studentData[$x-1][0];
	  $returnStr.="".$classNumber."studentrect".$seat.":Classroom #".$classNumber." - Student ".$x.":Classroom #".$classNumber." - Student #".$x." was seated.;";
  }
  $returnStr.="".$classNumber."teacherrect:Classroom #".$classNumber." - Teacher:Classroom #".$classNumber." - Teacher was seated.;";
  
  
  //append string concerning mask wearing for every student and teacher: Mask worn = no alarm, No mask = alarm
  for ($x = 1; $x <= $numStudents; $x++) {
	  $seat = $studentData[$x-1][0];
	  if (strval($studentData[$x-1][1]) == "1")
	  {
		  $returnStr.="".$classNumber."studentrect".$seat.":Classroom #".$classNumber." - Student ".$x." is wearing mask:Classroom #".$classNumber." - Student ".$x." is wearing mask.;";
	  }
	  else {
		  $returnStr.="".$classNumber."studentrect".$seat.":Classroom #".$classNumber." - Alarm (SENSOR 2) Student ".$x." is not wearing mask:Classroom #".$classNumber." -  Alarm (SENSOR 2) Student ".$x." is not wearing mask;";
	  }
  }
  if (strval($teacherdata[0] == "1"))
  {
	  $returnStr.="".$classNumber."teacherrect:Classroom #".$classNumber." - Teacher is wearing mask:Classroom #".$classNumber." - Teacher is wearing mask.;";
  }
  else {
	  $returnStr.="".$classNumber."teacherrect: Classroom #".$classNumber." - Alarm (SENSOR 2) Teacher is not wearing mask:Classroom #".$classNumber." - Alarm (SENSOR 2) Teacher is not wearing mask;";
  }
  
  
  //append string concerning applying Lysol before class: Apply lysol = no alarm, No lysol = alarm
  for ($x = 1; $x <= $numStudents; $x++) {
	  $seat = $studentData[$x-1][0];
	  if (strval($studentData[$x-1][2]) == "1")
	  {
		  $returnStr.="".$classNumber."studentrect".$seat.":Classroom #".$classNumber." - Student ".$x." applies Lysol before class:Classroom #".$classNumber." - Student ".$x." applies Lysol before class.;";
	  }
	  else {
		  $returnStr.="".$classNumber."studentrect".$seat.":Classroom #".$classNumber." - Alarm (SENSOR 3) Student ".$x." does not apply Lysol before class:Classroom #".$classNumber." - Alarm (SENSOR 3) Student ".$x." did not apply Lysol before class;";
	  }
  }
  if (strval($teacherdata[1] == "1"))
  {
	  $returnStr.="".$classNumber."teacherrect:Classroom #".$classNumber." - Teacher applies Lysol before class:Classroom #".$classNumber." - Teacher applies Lysol before class.;";
  }
  else {
	  $returnStr.="".$classNumber."teacherrect:Classroom #".$classNumber." - Alarm (SENSOR 3) Teacher does not apply Lysol before class:Classroom #".$classNumber." - Alarm (SENSOR 3) Teacher did not apply Lysol before class;";
  }
  
  //append string concerning Student and Teacher going to Question rectangle
  //if student and teacher go to rectangle: alarm
  //if student goes to question rectangle and teacher listens from teacher rectangle: no alarm
  for ($x = 1; $x <= $numStudents; $x++) {
	  $seat = $studentData[$x-1][0];
	  if (strval($studentData[$x-1][3]) == "1" && strval($teacherdata[2]) == "1")
	  {
		  $returnStr.="".$classNumber."studentrect".$seat.": :Classroom #".$classNumber." - Student ".$x." goes to Question Rectangle.;";
		  $returnStr.="".$classNumber."questionrectangle:Classroom #".$classNumber." - Student ".$x.":Classroom #".$classNumber." - Student prepares to ask question to Teacher;";
		  $returnStr.="".$classNumber."teacherrect: :Classroom #".$classNumber." - Teacher goes to Question Rectangle.;";
		  $returnStr.="".$classNumber."questionrectangle:Classroom #".$classNumber." - (SENSOR 1) Student ".$x." and Teacher:Classroom #".$classNumber." - Alarm (SENSOR 1) Student ".$x." and Teacher in Question Rectangle;";
		  $returnStr.="".$classNumber."questionrectangle: :Classroom #".$classNumber." - Student ".$x." and Teacher return to their rectangles;";
		  $returnStr.="".$classNumber."studentrect".$seat.":Classroom #".$classNumber." - Student ".$x." returns to seat:Classroom #".$classNumber." - Student ".$x." returns to seat.;";
		  $returnStr.="".$classNumber."teacherrect:Classroom #".$classNumber." - Teacher resumes teaching:Classroom #".$classNumber." - Teacher resumes teaching.;";
	  }
	  else if (strval($studentData[$x-1][3]) == "1" && strval($teacherdata[2]) == "0")
	  {
		  $returnStr.="".$classNumber."studentrect".$seat.": :Classroom #".$classNumber." - Student ".$x." goes to Question Rectangle.;";
		  $returnStr.="".$classNumber."questionrectangle:Classroom #".$classNumber." - Student ".$x.":Classroom #".$classNumber." - Student prepares to ask question to Teacher;";
		  $returnStr.="".$classNumber."teacherrect:Classroom #".$classNumber." - Teacher listens to question:Classroom #".$classNumber." - Teacher listens to question;";
		  $returnStr.="".$classNumber."questionrectangle:Classroom #".$classNumber." - Student ".$x.":Classroom #".$classNumber." - Student ".$x." in Question Rectangle;";
		  $returnStr.="".$classNumber."questionrectangle: :Classroom #".$classNumber." - Student ".$x." leaves question rectangle;";
		  $returnStr.="".$classNumber."studentrect".$seat.":Classroom #".$classNumber." - Student ".$x." returns to seat:Classroom #".$classNumber." - Student ".$x." returns to seat.;";
		  $returnStr.="".$classNumber."teacherrect:Classroom #".$classNumber." - Teacher resumes teaching:Classroom #".$classNumber." - Teacher resumes teaching.;";
	  }
  }
  
  //append string concerning students visiting other student rectangles
  //if target student rectangle is occupied: alarm
  //if target student rectangle is empty: no alarm
  for ($x = 1; $x <= $numStudents; $x++) {
		$destination = intval($studentData[$x-1][4]);
		$seat = $studentData[$x-1][0];
		$occupied = false;
		for ($y=1; $y <= $numStudents; $y++)
		{
			if (intval($studentData[$y-1][0]) == $destination)
			{
				$occupied = true;
				$returnStr.="".$classNumber."studentrect".$seat.": :Classroom #".$classNumber." - Student ".$x." goes to Student Rectangle ".$destination.";";
				$returnStr.="".$classNumber."studentrect".$destination.":Classroom #".$classNumber." - (SENSOR 1) Student ".$x." and Student ".$y.":Classroom #".$classNumber." - Alarm (SENSOR 1) Two Students in Student Rectangle ".$destination.";";
				$returnStr.="".$classNumber."studentrect".$destination.":Classroom #".$classNumber." - Student ".$y.":Classroom #".$classNumber." - Student ".$x." leaves Student Rectangle ".$destination.";";
				$returnStr.="".$classNumber."studentrect".$seat.":Classroom #".$classNumber." - Student ".$x.":Classroom #".$classNumber." - Student ".$x." returns to designated Rectangle;";
			}
		}
		if ($occupied == false && $destination != 0)
		{
			$returnStr.="".$classNumber."studentrect".$seat.": :Classroom #".$classNumber." - Student ".$x." goes to Student Rectangle ".$destination.".;";
			$returnStr.="".$classNumber."studentrect".$destination.":Classroom #".$classNumber." - Student ".$x.":Classroom #".$classNumber." - Student ".$x." sits in Student Rectangle ".$destination.".;";
			$returnStr.="".$classNumber."studentrect".$destination.": :Classroom #".$classNumber." - Student ".$x." leaves Student Rectangle ".$destination.".;";
			$returnStr.="".$classNumber."studentrect".$seat.":Classroom #".$classNumber." - Student ".$x.":Classroom #".$classNumber." - Student ".$x." returns to designated Rectangle;";
		}
  
  }
  
  
  //append string concerning students and teacher applying lysol after class
  //if students/teacher apply Lysol: no alarm
  //if students/teacher don't apply Lysol: alarm
  for ($x = 1; $x <= $numStudents; $x++) {
	  $seat = $studentData[$x-1][0];
	  if (strval($studentData[$x-1][5]) == "1")
	  {
		  $returnStr.="".$classNumber."studentrect".$seat.":Classroom #".$classNumber." - Student ".$x." applies Lysol after class:Classroom #".$classNumber." - Student ".$x." applies Lysol after class.;";
	  }
	  else {
		  $returnStr.="".$classNumber."studentrect".$seat.":Classroom #".$classNumber." - Alarm (SENSOR 3) Student ".$x." does not apply Lysol after class:Classroom #".$classNumber." - Alarm (SENSOR 3) Student ".$x." did not apply Lysol after class;";
	  }
  }
    if (strval($teacherdata[3] == "1"))
  {
	  $returnStr.="".$classNumber."teacherrect:Classroom #".$classNumber." - Teacher applies Lysol after class:Classroom #".$classNumber." - Teacher applies Lysol after class.;";
  }
  else {
	  $returnStr.="".$classNumber."teacherrect:Classroom #".$classNumber." - Alarm (SENSOR 3) Teacher does not apply Lysol after class:Classroom #".$classNumber." - Alarm (SENSOR 3) Teacher did not apply Lysol after class;";
  }
  
  
  //append string concerning students and teacher applying Hand Sanitizer before leaving
  //if students/teacher apply Hand Sanitizer: no alarm
  //if students/teacher don't apply Hand Sanitizer: alarm
  for ($x = 1; $x <= $numStudents; $x++) {
      $seat = $studentData[$x-1][0];
	  $returnStr.="".$classNumber."studentrect".$seat.": :Classroom #".$classNumber." - Student ".$x." prepares to exit classroom.;";
	  if (strval($studentData[$x-1][6]) == "1")
	  {
		  $returnStr.="".$classNumber."entrance:Classroom #".$classNumber." - Student ".$x." applies Hand Sanitizer before leaving:Classroom #".$classNumber." - Student ".$x." applies Hand Sanitizer before leaving.;";
	  }
	  else {
		  $returnStr.="".$classNumber."entrance:Classroom #".$classNumber." - Alarm (SENSOR 4) Student ".$x." did not apply Hand Sanitizer before leaving:Classroom #".$classNumber." - Alarm (SENSOR 4) Student ".$x." did not apply Hand Santizer before leaving.;";
	  }
  }
  $returnStr.="".$classNumber."teacherrect: :Classroom #".$classNumber." - Teacher prepares to exit classroom.;";
  if (strval($teacherdata[4] == "1"))
  {
	  $returnStr.="".$classNumber."entrance:Classroom #".$classNumber." - Teacher applies Hand Sanitizer after class:Classroom #".$classNumber." - Teacher applies Hand Sanitizer after class.";
  }
  else {
	  $returnStr.="".$classNumber."entrance:Classroom #".$classNumber." - Alarm (SENSOR 4) Teacher does not apply Hand Sanitizer after class:Classroom #".$classNumber." - Alarm (SENSOR 4) Teacher did not apply Hand Sanitizer before leaving.";
  }
  
  //finally, return string to server
  echo $returnStr;
?>