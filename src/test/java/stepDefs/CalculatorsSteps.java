package stepDefs;




import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CalculatorsSteps {
	
	int result=0;
	
	@Given("I have calculator")
	public void i_have_calculator() {
	    // Write code here that turns the phrase above into concrete actions

		System.out.println("Inside Calculator");
	}

	@When("I add {int} and {int}")
	public void i_add_and(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions
		
		result=num1+num2;
	}

	@Then("I see the result as {int}")
	public void i_see_the_result_as(int res) {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertEquals(res, result);
		


	}

	@When("I sub {int} and {int}")
	public void i_sub_and(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions

		result =num1-num2;
	}
	@When("I add below numbers")
	public void i_add_below_numbers(io.cucumber.datatable.DataTable dataTable) {
	   
		
		int row = dataTable.height();
		
		for(int i=0; i< row;i++) {
			
			result =result + Integer.parseInt(dataTable.cell(i,0));
		}
	}

	@When("I add below numbers using List")
	public void i_add_below_numbers_using_list(List<Integer> numbers) {
		
		for(int num : numbers) {
			
			result =result +num;
			
		}
	  
		
	}

	@When("I order below items")
	public void i_order_below_items(Map<String,Integer> pricelist) {
	    
	for( String key : pricelist.keySet()) {
		
		result =result+pricelist.get(key);
	}
	
	
	}

	@When("I order below items and qunatity")
	public void i_order_below_items_and_qunatity(io.cucumber.datatable.DataTable dataTable) {
	    
		int row = dataTable.height();
		for(int i=0; i< row;i++) {
			
			int qty = Integer.parseInt(dataTable.cell(i,1));
			int val = Integer.parseInt(dataTable.cell(i,2));
			
			
			result =result+ qty*val;
		}
	
	}



}
