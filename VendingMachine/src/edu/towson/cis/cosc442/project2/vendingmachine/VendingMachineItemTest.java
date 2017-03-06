package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineItemTest {

	VendingMachineItem Tester1, Tester2;
	
	@Before
	
	public void setUp() throws Exception {
		Tester2 = new VendingMachineItem("Tea", 2);
		
	}
	@Test
	public void testVendingMachineItem() {
		Tester1 = new VendingMachineItem("Milk", 1);
		assertEquals(Tester1.getName(), "Milk");
		assertEquals(Tester1.getPrice(), 1, .002);
	}

	@Test
	public void testGetName() {
		assertEquals(Tester2.getName(), "Tea");
		
	}

	@Test
	public void testGetPrice() {
		assertEquals(Tester2.getPrice(), 2, .002);
	}

}
