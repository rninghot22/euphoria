package cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class PalindromeStepDef {

    private String testPalindrome; //coin
    private boolean isPalindrome;

    @Given("I entered string {string}")   //  I entered string "Coin"
    public void iEnteredString(String toTest) {
        testPalindrome = toTest;
    }
    

    @When("I test it for Palindrome") //I test it for Palindrome
    public void iTestItForPalindrome() {
        isPalindrome = testPalindrome.equalsIgnoreCase(new StringBuilder(testPalindrome).reverse().toString());
    }

    @Then("the result should be {string}")  //the result should be "true"
    public void theResultShouldBe(String result) {
        boolean expectedResult = Boolean.parseBoolean(result);
        if (expectedResult) {
            Assert.assertTrue(isPalindrome);
        } else {
            Assert.assertFalse(isPalindrome);
        }
    }
    
}
