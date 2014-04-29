package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.AfterClass;
import org.junit.Test;

public class SnakeCamelTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void  snakeToCamelcaseをなおす(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String testing = "test_est_st_t";
		String expected = "TestEstStT";
		String answer = snake.snakeToCamelcase(testing);
		assertThat(answer,is(expected));
		
		
	}
	
	@Test
	public void camelToSnakecaseをなおそう(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String testing = "QuestEst";
		String expected ="quest_est";
		String answer = snake.camelToSnakecase(testing);
		assertThat(answer,is(expected));
	}
}
