# JSON Comparator Utility
This is a comparator project which can be used to compare 2 API responses. The input to this project should be two files with request URLs. 
<br/> Each file should contain (HTTP/HTTPS) API's separated by a new line.


## Dependencies

Here are the dependencies used in the project for development & testing perspective. 
<br/> Note - All are open source project and widely available over the web. Setup the maching with below applications to test the code further.

* [Java 1.8](https://www.java.com/en/) - Coding Language
* [Maven](https://maven.apache.org/) - Dependency Management
* [RestAssured](http://rest-assured.io/) - Used to get API Response
* [json](https://mvnrepository.com/artifact/org.json/json) - JSON encoders/decoders in Java
* [JUnit](https://junit.org/) - Testing framework for Java 


## Getting Started

These instructions will get you a copy of the project up and running, on your local machine for development and testing purposes. 

```
1) Open your terminal and do a clone of this project.
2) Navigate to the respective directory and run below command.
   mvn clean install
3) Above command will build the project along with test cases.
4) If you something like below text on terminal, means project ran successfully locally. 
````
````
[INFO] ------------------------------------------------------------------------
[INFO]  T E S T S
[INFO] ------------------------------------------------------------------------

[INFO] Results:
[INFO]
[INFO] Tests run: 34, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
   
```

## Testing with two files containing request URLs in each files. 

```
Sample code test this project with files.

import com.assignment.comparator.Comparator;
import com.assignment.comparator.ComparatorImpl;

Comparator comparator = new ComparatorImpl();
// Creating object of implementation class.

String FileName1 = System.getProperty("user.dir")+ "/Files/Sample1.txt";
// creating the variable FileName1 with complete path and file extension.

String FileName2 = System.getProperty("user.dir")+ "/Files/Sample2.txt";
// creating the variable FileName2 with complete path and file extension.	

comparator.isJsonEqual(FileName1, FileName2);
//Calling the method, and passing both the file name.
	
```


<br/> Note - For above piece of code, We have below files placed inside workspace directory.
<br/>
<br/>
* Sample1.txt
<br/>
* Sample2.txt
<br/>
<br/>
Output should be like below -

```
https://reqres.in/api/users?page=2 not equals https://reqres.in/api/users/2
https://reqres.in/api/users?page=2 equals https://reqres.in/api/users?page=2
https://reqres.in/api/users/1 not equals https://reqres.in/api/unknown
https://reqres.in/api/users/2 equals http://reqres.in/api/users/2
https://reqres.in/api/users/4 not equals https://reqres.in/
====>> Invalid URL ====>> /in/api/
/in/api/ not equals https://reqres.in/api/users/2
```

## In case you want to use this in some other project. 

```
1) Run the project locally on local machine.
2) Use below dependency in pom.xml file of the other project.
3) You will see "comparator-0.0.1-SNAPSHOT.jar" file in Maven Dependencies
4) Use above sample code to write your test/feature.
```
```
<dependency>
	<groupId>com.assignment</groupId>
	<artifactId>comparator</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```
