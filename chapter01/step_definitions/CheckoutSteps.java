package step_definitions;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import implementation.Checkout;

import static org.junit.Assert.*;

public class CheckoutSteps{

        int bananaPrice = 0;
        int applePrice = 0;
        Checkout checkout = new Checkout();
   
 
	@Given("^the price of a \"(.*?)\" is (\\d+)c$")
	public void thePriceOfAIsC(String name, int price) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    if(name.equals("banana"))
           this.bananaPrice = price;
        else if (name.equals("apple"))
        	this.applePrice = price;
	}

	@When("^I checkout (\\d+) \"(.*?)\"$")
	public void iCheckout(int itemCount, String itemName) throws Throwable {
		   if(itemName.equals("banana"))
           	checkout.add(itemCount,bananaPrice);
           else if (itemName.equals("apple"))
           	checkout.add(itemCount,applePrice);
	}

	@Then("^the total price should be (\\d+)c$")
	public void theTotalPriceShouldBeC(int total) throws Throwable {
          assertEquals(total,checkout.total());
	}
   

}
