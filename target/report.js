$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/2DMap.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User Launch Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "TrafficPlan.User_Launch_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Add Traiff Plan",
  "keyword": "And "
});
formatter.match({
  "location": "TrafficPlan.click_Add_Traiff_Plan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Provide Traffic Plan Details",
  "rows": [
    {
      "cells": [
        "rent",
        "lmin",
        "intermin",
        "sms",
        "min",
        "intermin_char",
        "sms_char"
      ]
    },
    {
      "cells": [
        "399",
        "300",
        "30",
        "100",
        "20",
        "50",
        "100"
      ]
    },
    {
      "cells": [
        "198",
        "150",
        "60",
        "100",
        "30",
        "100",
        "120"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TrafficPlan.user_Provide_Traffic_Plan_Details(DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#inter_charge\"}\n  (Session info: chrome\u003d76.0.3809.132)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SAMBATHKUAMR\u0027, ip: \u0027192.168.1.103\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_112\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.132, chrome: {chromedriverVersion: 75.0.3770.90 (a6dcaf7e3ec6f..., userDataDir: C:\\Users\\Sambath\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:51084}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 98ea60b6039b2bf8b920833557e6978d\n*** Element info: {Using\u003did, value\u003dinter_charge}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat cucumber.sceanerio.tasks.TrafficPlan.user_Provide_Traffic_Plan_Details(TrafficPlan.java:72)\r\n\tat ✽.User Provide Traffic Plan Details(src/test/resources/Feature/2DMap.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Verify Plan Sholuld be Added",
  "keyword": "Then "
});
formatter.match({
  "location": "TrafficPlan.verify_Plan_Sholuld_be_Added()"
});
formatter.result({
  "status": "skipped"
});
});