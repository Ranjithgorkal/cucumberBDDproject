package Stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass {
		 @Before
		    public void setUp() {
		        initDriver();
		    }

		    @After
		    public void tearDown() {
		        closeDriver();
		    }
}
