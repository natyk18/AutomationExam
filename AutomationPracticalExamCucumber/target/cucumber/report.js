$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TFTest.feature");
formatter.feature({
  "line": 3,
  "name": "BackGround color change fynctionality1",
  "description": "",
  "id": "background-color-change-fynctionality1",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Sky Blue Background;",
  "description": "",
  "id": "background-color-change-fynctionality1;sky-blue-background;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Set SkyBlue Backgroun button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefinition.set_SkyBlue_Backgroun_button_exists()"
});
formatter.result({
  "duration": 4690662100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_click_on_the_button()"
});
formatter.result({
  "duration": 48542800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 883788800,
  "status": "passed"
});
formatter.uri("TFTest2.feature");
formatter.feature({
  "line": 2,
  "name": "BackGround color change fynctionality2",
  "description": "",
  "id": "background-color-change-fynctionality2",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "White Background Change;",
  "description": "",
  "id": "background-color-change-fynctionality2;white-background-change;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click  the button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefinition.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "duration": 2195993300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_click_the_button()"
});
formatter.result({
  "duration": 49170700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 714449600,
  "status": "passed"
});
});