# fatech-web-automation

This project is a sample of web automation with selenium and java.

## Getting Started

* [Java 8](https://www.java.com/pt_BR/download/)
* A IDE for developing, [Eclipse](http://www.eclipse.org/downloads/packages/) or [Intellij](https://www.jetbrains.com/idea/download/#section=mac)
* Download [ChromeDriver](http://chromedriver.chromium.org/downloads)

## First Step

### Create your maven project

* Set Archetype QuickStart 1.1
* Set your GroupId 
* Set your ArtifactId

### Update project configuration and dependencies

* See your JRE System set this to **JavaSE 1.8** (only if you need)
* Create a folder calling driver and paste Chromedriver.exe inside
* Update Junit Dependency to **4.12**

```xml
<dependency>
  <groupId>junit</groupId>
  <artifactId>junit</artifactId>
  <version>4.12</version>
  <scope>test</scope>
</dependency>
```

* Add selenium java dependency 

```xml
<dependency>
  <groupId>org.seleniumhq.selenium</groupId>
  <artifactId>selenium-java</artifactId>
  <version>3.12.0</version>
</dependency>
```

## Second Step

### Create your test class

* Set your class name
* Set your class methods

```java
@BeforeClass
public static void tearUp() {
 // run one time before everything
}
```

```java
@Test
public void sum() {
 // this is a test method  
}
```

```java
@AfterClass
public static void tearDown() {
 // run after all
}
```

## Third Step

### Create your test flow

* Set Chromedriver path and create a chromeDriver instance 

```java
// Set chromedriver path 

 System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

// Create chromedriver instance

 webDriver = new ChromeDriver();
```
* Open a url in chromedriver

```java
// Opening a url

  webDriver.get("https://kalyneramon.com.br/lel/calc/");
```

* Fill input element
```java
// Fill input explanation line by line

  webDriver.findElement(By); -> // find a web element by locator 
  
  By.id("myiD") -> // my locator is a id of a element
  
  webDriver.findElement(By.id("myID")).sendKeys("MY TEXT") -> // sendKeys fill a input find by id with "MY TEXT"
```

* Click in a element
```java
// Just find a element by id and click in this element

  webDriver.findElement(By.id("myID")).click();
```

* Check result of all flow interaction
```java

// Get the text of element and remove spaces from start and end of full text

  String result =  webDriver.findElement(By.id("resultWeb")).getText().trim();
  
// Compare text of screen with text of you want!

  assertTrue("Error when try to sum two numbers!", "40".equals(result)); -> // if the result is different from forty, you will see the message of error!
``` 
 
 * Finally after all tests close you webDriver.
 ```java
 // Easy like sunday morning :)
 
   webDriver.close();
 ``` 
 
 ## Fourth Step
 
 ### Running tests with maven
 
 * Inside the root directory of project run
 ```
 $ mvn clean test
 ```
 
 ## Challenge!
 
 ### Can you test all operations flow of this web simple calculator ?

* https://kalyneramon.com.br/lel/calc/

It's your challenge, change this actual code to do this!

![Nerdddd](https://media.giphy.com/media/xghFgmOKbk0G4/giphy.gif "You Can!!")
 
  











