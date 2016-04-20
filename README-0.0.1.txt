										README 
										====== 
////////////////////////////////////////////////////////////////////////////////////////////
// Count Words Java Development Assignment 0.0.1 release  -  $Date: 2016/20/03 20:00:00 $ //
////////////////////////////////////////////////////////////////////////////////////////////

			
CONTENTS OF THIS FILE
---------------------
   
 * Introduction
 * Hints and constraints
 * project formation
 * Requirements
 * Installation
 * FAQ
 

INTRODUCTION
------------
Write a program called Count Words that processes a List of Strings and applies the following business rules:

Req 1.	Counts and returns the NUMBER of words (i.e. Strings) that start with "M" or "m"
Req 2.	Returns all the words longer than 5 characters

HINTS & CONSTRAINTS:
-------------------

1.	Make sure you implement this test like you would all your production code. Other developers might want to extend it one day! 
2.	Business rules change and new ones pop up all the time.
3.	Please don't read from standard input, no one likes to type long list of names manually.


PROJECT FORMATION:
-----------------
	1. Abstract classes are used for each core Business in order to support Constraint 1&2, so that new businesses can be added easily.
	2. Reads input Name Strings from "names.txt" input file in the working directory. 
	3. package "com.dgitsystems.codingtest.countwords.service.findnumber" contains "NUMBER of words" business abstract class and implementations
	4. package "com.dgitsystems.codingtest.countwords.service.findwords" contains "words longer than 5 characters" business abstract class and implementations
	5. Main client program is "com.dgitsystems.codingtest.countwords.main.Main" 
	6. log4j is used for logging purpose.
	7. This is a Maven project, can be opened in any editor that supports Maven
	8. UNIT Test cases are included.

Requirements
------------
	Please refer to pom.xml
	
Installation
------------
	Requires java SE 1.6	
	"Spring Tool Suite Version: 3.7.3" IDE was used to build this project
	
FAQ
---
    For any queries please send me a mail at rokon.63@gmail.com or call me at +61452598219 
