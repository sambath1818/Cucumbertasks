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
  "status": "passed"
});
formatter.step({
  "name": "Verify Plan Sholuld be Added",
  "keyword": "Then "
});
formatter.match({
  "location": "TrafficPlan.verify_Plan_Sholuld_be_Added()"
});
formatter.result({
  "status": "passed"
});
});