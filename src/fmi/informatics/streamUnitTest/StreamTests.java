package fmi.informatics.streamUnitTest;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import fmi.informatics.functional.StudentStreamUtils;

public class StreamTests {

	@Test
	public void testRunOfApp() {
		StudentStreamUtils.main(null);
	}
	
	@Test
	public void testTask1() {
		assertNotNull(StudentStreamUtils.task1ForTest());
	}
	
	@Test
	public void testTask2() {
		assertNotNull(StudentStreamUtils.task2ForTest());
	}
	
	@Test
	public void secondTestTask2() {
		List<String> expectedDrinks = new ArrayList<>();
		expectedDrinks.add("COFFEE");
		expectedDrinks.add("HOT CHOCOLATE");
		expectedDrinks.add("WINE");
		expectedDrinks.add("WHISKY");
		expectedDrinks.add("WATER");
		ArrayList<String> drinks = (ArrayList<String>) StudentStreamUtils.task2ForTest();	
		assertTrue(drinks.containsAll(expectedDrinks));
	}
	
	@Test
	public void testTask3() {
		assertNotNull(StudentStreamUtils.task3ForTest());
	}
}
