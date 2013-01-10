package pl.kwi.main;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import pl.kwi.factories.AbstractFactory;
import pl.kwi.toys.Toy;

public class MainTest {
	
	private Main main;

	@Before
	public void setUp() throws Exception {
		main = new Main();
	}

	@Test
	public void getToysFromPoland(){
		
		List<Toy> toys = main.getToysFromPoland();
		Toy toy;
		
		toy = toys.get(0);
		assertEquals(Toy.BEAR, toy.getName());
		assertEquals(AbstractFactory.POLAND, toy.getProperty("country"));
		
		toy = toys.get(1);
		assertEquals(Toy.CAR, toy.getName());
		assertEquals(AbstractFactory.POLAND, toy.getProperty("country"));
		
		toy = toys.get(2);
		assertEquals(Toy.DOLL, toy.getName());
		assertEquals(AbstractFactory.POLAND, toy.getProperty("country"));
		
	}
	
	@Test
	public void getToysFromGermany(){
		
		List<Toy> toys = main.getToysFromGermany();
		Toy toy;
		
		toy = toys.get(0);
		assertEquals(Toy.BEAR, toy.getName());
		assertEquals(AbstractFactory.GERMANY, toy.getProperty("country"));
		
		toy = toys.get(1);
		assertEquals(Toy.CAR, toy.getName());
		assertEquals(AbstractFactory.GERMANY, toy.getProperty("country"));
		
		toy = toys.get(2);
		assertEquals(Toy.DOLL, toy.getName());
		assertEquals(AbstractFactory.GERMANY, toy.getProperty("country"));
		
	}
	
	@Test
	public void getToysFromEngland(){
		
		List<Toy> toys = main.getToysFromEngland();
		Toy toy;
		
		toy = toys.get(0);
		assertEquals(Toy.BEAR, toy.getName());
		assertEquals(AbstractFactory.ENGLAND, toy.getProperty("country"));
		
		toy = toys.get(1);
		assertEquals(Toy.CAR, toy.getName());
		assertEquals(AbstractFactory.ENGLAND, toy.getProperty("country"));
		
		toy = toys.get(2);
		assertEquals(Toy.DOLL, toy.getName());
		assertEquals(AbstractFactory.ENGLAND, toy.getProperty("country"));
		
	}

}
