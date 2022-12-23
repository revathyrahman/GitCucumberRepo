package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchAmazon {
	
	@Given("I access the amazon online retail portal")
	public void I_access_the_amazon_online_retail_portal()
	{
		System.out.println(">>>>>>>Inside Given code definition");
		
	}
	
	@When("I go to the categories section")
	public void I_go_to_the_categories_section()
	{
		
		System.out.println(">>>>>>>Inside When categories code definition");
	}
	
	@Then("I should be able to select books category from the categories")
	public void I_should_be_able_to_select_books_category_from_the_categories()
	{
		System.out.println(">>>>>>>Inside Then categories code definition");
	}
	

    @Then("^I expect the Top picks of books should be displayed$")
    public void i_expect_the_top_picks_of_books_should_be_displayed() {
    	System.out.println(">>>>>>>Inside Then book categories code definition");
       
    }

    @And("^I click on search$")
    public void i_click_on_search() {
    	System.out.println(">>>>>>>Inside And categories code definition");
       
    }

    @But("^not any other products from any other category$")
    public void not_any_other_products_from_any_other_category(){
    	
    	System.out.println(">>>>>>>Inside But categories code definition");
        
    }
}
