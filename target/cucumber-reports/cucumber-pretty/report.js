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
    },
    {
      "name": "@Regression"
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
  "status": "passed"
});
formatter.step({
  "name": "Select depart date",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_StepDefinition.select_depart_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage_StepDefinition.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Listing page should load",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_StepDefinition.listing_page_should_load()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});