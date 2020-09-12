# Comprando Burguer con Appium

Video: https://www.youtube.com/watch?v=joFv32Lv0HQ&feature=youtu.be

Repo personal de estudio de Nano con focus en Appium for mobile Automation.
Primera toma de contacto con Appium.

Feature: Comprar una Burguer en Rappi Automatizando con Appium y Java.


------------------------------------------------------------
Java
Selenium
Maven
TestNg
Page Object Model Pattern
Appium


What we will do:
1. Create a java maven project in eclipse
2. Add required libraries
3. Create classes and functions
4. Add desired capabilities
5. Setup mobile device and appium
6. Create tests for mobile test automation
7. Run and test 

Prerequisites:
1. Java JDK -https://www.youtube.com/playlist?list...
2. Appium is installed
3. Android sdk is setup (for testing on android )
4. Xcode is setup (for testing on iOS)
5. Mobile device is ready for automationhttps://www.youtube.com/playlist?list...
6. Eclipse is installed 

Step 1 : Open Eclipse

Step 2 : Install TestNG in eclipsehttps://www.youtube.com/watch?v=yyUyi...

Step 3 : Create a new maven project

Step 4 : Add required lib/dependencies
   Appium java client
   Selenium java
   TestNG

Step 5 : Save - Clean - Build project

Step 6 : Create 2 folders under src/test/java
   tests
   pages

Step 7 : User src/test/resources create a folder
   apps
   will keep application files (.apk, .ipa, .app)

Step 8 : Inside tests folder create a class - BaseClass

Step 9 : Create setup & teardown functions
   Annotate with testng annotations

Step 10 : Add code for desired capabilities

Step 11 : Attach mobile device (or make emulator ready)
   adb devices
   get id and platform ver and add in desired capabilities

Step 12 : Start appium server

Step 13 : Run & test

Step 14 : Add test class and extend BaseClass

Step 15 : Create some more sample tests 

Step 16 : Run & Test
