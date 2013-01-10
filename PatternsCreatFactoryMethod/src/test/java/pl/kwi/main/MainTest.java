package pl.kwi.main;

import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import pl.kwi.packages.Package;
import pl.kwi.toys.Toy;

public class MainTest {
	
	private Main main;

	@Before
	public void setUp() throws Exception {
		main = new Main();
	}
	
	@Test
	public void getPackageWithBear(){
		
		Package pack = main.getPackageWithBear();
		Toy toy = pack.getToy();
		
		assertEquals(Toy.BEAR, toy.getName());
		
	}
	
	@Test
	public void getPackageWithCar(){
		
		Package pack = main.getPackageWithCar();
		Toy toy = pack.getToy();
		
		assertEquals(Toy.CAR, toy.getName());
		
	}
	
	@Test
	public void getPackageWithDoll(){
		
		Package pack = main.getPackageWithDoll();
		Toy toy = pack.getToy();
		
		assertEquals(Toy.DOLL, toy.getName());
		
	}

}
