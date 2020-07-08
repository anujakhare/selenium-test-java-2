package steps;

import cucumber.api.java8.En;
import pages.Page;

public class StepDefs extends Page implements En  {

    public StepDefs() {
        Given("I go to url (.*)$", (final String url) ->  getUrl(url));
        When("I enter (.*) into search box area$",(final String input) -> getInput(input));
        And("I click on search button$", () -> submitButton());
        Then("I should see the result on page$", () -> seeResultPage());
    }

}
