$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("tc1.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "As a user\nI want to be able to sign in into Komi\nSo that i can access my profile",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#  Background:"
    },
    {
      "line": 6,
      "value": "#  Given the user is on landing page"
    },
    {
      "line": 7,
      "value": "#  When user chooses to sign in"
    }
  ],
  "line": 10,
  "name": "Sign in",
  "description": "",
  "id": ";sign-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@SignIn-Simple"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "the user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user chooses to sign in",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user enters the credentials",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user clicks sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user should be logged in to the website",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});