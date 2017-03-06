package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;






public class VendingMachineTest {
	VendingMachine testVend;
	VendingMachineItem milk, tea, water, soda;
	
	@Before
	
	public void setUp() throws Exception {
		testVend = new VendingMachine();
		milk = new VendingMachineItem("Milk",1 );
		tea = new VendingMachineItem("Tea", 2 );
		water = new VendingMachineItem("Water", 3 );
		soda = new VendingMachineItem("Soda", 4 );
		testVend.addItem(milk, "A");
		testVend.balance = 100;
		
	}
	/**
	 * Test to make sure when the items are added that are able to be returned.
	 */
	@Test
	public void testAddItem() {
		
		
		testVend.addItem(tea, "B");
		testVend.addItem(water, "C");
		testVend.addItem(soda, "D");
		
		assertEquals(testVend.getItem("B"), tea);
		assertEquals(testVend.getItem("C"), water);
		assertEquals(testVend.getItem("D"), soda);
		
				
	}
	
	/**
	 * Test to make sure when the items are removed that become null
	 */
	@Test
	public void testRemoveItem() {
		testVend.removeItem("A");
		assertEquals(testVend.getItem("A"), null);
	}

	/**
	 * Test to make sure adding money increases the balance
	 */
	@Test
	public void testInsertMoney() {
		testVend.insertMoney(69.00);
		assertEquals(testVend.balance, 169, .001);
	}

	/**
	 * Test to make sure the balance is returned properly
	 */
	@Test
	public void testGetBalance() {
		assertEquals(testVend.getBalance(), 100, .001);
	}

	/**
	 * Test to make sure that when purchasing an item the balance goes down and the item is removed
	 */
	@Test
	public void testMakePurchase() {
		testVend.makePurchase("A");
		assertEquals(testVend.balance, 99, .001);
		assertEquals(testVend.getItem("A"),null);
	}
	
	/**
	 * Test to make sure that when you get change it gives you the proper ammount and the machine change becomes zero
	 */
	@Test
	public void testReturnChange() {
		assertEquals(testVend.returnChange(), 100,.001);
		assertEquals(testVend.balance, 0 , .001);
		
	}
	@After
	public void tearDown(){
		testVend=null;
		milk = null;
		tea = null;
		soda = null;
		water = null;
	}

}
