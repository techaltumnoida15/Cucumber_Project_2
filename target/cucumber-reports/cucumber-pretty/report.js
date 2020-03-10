$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/HomePage.feature");
formatter.feature({
  "name": "Automate home page features such as initiate search etc",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePage_StepDefinition.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Initiate Search for ONEWAY",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Select OneWay",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_StepDefinition.select_OneWay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter fromCity",
  "rows": [
    {
      "cells": [
        "LAX"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_StepDefinition.enter_fromCity(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter to city \"NYC\"",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage_StepDefinition.enter_to_city(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression  because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d80.0.3987.132)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.5\u0027, revision: \u0027d54ebd709a\u0027, time: \u00272018-11-06T11:42:16\u0027\nSystem info: host: \u0027DESKTOP-AMSG348\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\atyag\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:61954}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: cfda21c46fb645ff9d6e10b2162530d5\n*** Element info: {Using\u003dxpath, value\u003d}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.pageObject.com.HomePage.enterToCity(HomePage.java:35)\r\n\tat org.cheapOair.com.HomePage_StepDefinition.enter_to_city(HomePage_StepDefinition.java:100)\r\n\tat ✽.Enter to city \"NYC\"(file:src/test/java/features/HomePage.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Select depart date",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_StepDefinition.select_depart_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage_StepDefinition.click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Listing page should load",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_StepDefinition.listing_page_should_load()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});