# fatech-web-automation

This project is a sample of web automation with selenium and java.

## Getting Started

* Java 8 
* A IDE for developing, Eclipse or Intellij
* Download ChromeDriver

## First Step

### Create your maven project

* Set Archetype QuickStart 1.1
* Set your GroupId 
* Set your ArtifactId

### Update project configuration and dependencies

* See your JRE System set this to **JavaSE 1.8** (only if you need)
* Create a folder calling driver and paste Chromedriver.exe inside
* Update Junit Depedency to **4.12**

```xml
<dependency>
  <groupId>junit</groupId>
  <artifactId>junit</artifactId>
  <version>4.12</version>
  <scope>test</scope>
</dependency>
```

* Add selenium java depedency 

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

  webDriver.get("https://kalyneramon.com.br/lel/");
```

* Fill input element
```java
// Fill input explaning line by line

  webDriver.findElement(By); -> // find a web element by locator 
  
  By.id("myiD") -> // my locator is a id of a element
  
  webDriver.findElement(By.id("myID")).sendKeys("MEU TEXTO") -> // sendKeys fill a input find by id with "MEU TEXTO"
```

* Click in a element
```java
// Just find a element by id and click in this element

  webDriver.findElement(By.id("myID")).click();
```

* Check result of all flow interacation
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
 
 * Inside the root directory of projet run
 ```
 $ mvn clean test
 ```
 
 ## Challange!
 
 ### Can you test all operations flow of this web simple calculator ?

* https://kalyneramon.com.br/lel/

It's your challange, change this actual code to do this!

![Digimon mail loading](https://media.giphy.com/media/EK4fZHK5hx9mw/giphy.gif "You Can!!")
 
  









