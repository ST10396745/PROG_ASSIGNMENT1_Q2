/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package coffeshopapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author William Stainton
 */
public class CoffeeShopTest {
    
    public CoffeeShopTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of checkAmountEntered method, of class CoffeeShop.
     */
    @Test
    public void testCheckAmountEntered() {
        System.out.println("checkAmountEntered");
        int amt = 500;
        CoffeeShop instance = new CoffeeShop();
        boolean expResult = true;
        boolean result = instance.checkAmountEntered(amt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkAmount method, of class CoffeeShop.
     */
    @Test
    public void testCheckAmount() {
        System.out.println("checkAmount");
        CoffeeShop instance = new CoffeeShop();
        instance.setBalance(500);
        int expResult = 500;
        int result = instance.checkAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of isLoggedIn method, of class CoffeeShop.
     */
    @Test
    public void testIsLoggedIn() {
        System.out.println("isLoggedIn");
        CoffeeShop instance = new CoffeeShop();
        boolean expResult = false;
        boolean result = instance.isLoggedIn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkUser method, of class CoffeeShop.
     */
    @Test
    public void testCheckUser() {
        System.out.println("checkUser");
        String user = "sssss";
        CoffeeShop instance = new CoffeeShop();
        boolean expResult = true;
        boolean result = instance.checkUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkPass method, of class CoffeeShop.
     */
    @Test
    public void testCheckPass() {
        System.out.println("checkPass");
        CoffeeShop instance = new CoffeeShop();
        instance.pass = "sssssss5";
        boolean expResult = true;
        boolean result = instance.checkPass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
