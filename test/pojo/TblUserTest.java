/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class TblUserTest {
    
    public TblUserTest() {
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
     * Test of save_user method, of class TblUser.
     */

    /**
     * Test of login_user method, of class TblUser.
     */
    @Test
    public void testLogin_user() {
        System.out.println("Test Login User");
        
        TblUser instance = new TblUser();
        instance.setUssername("nawa");
        instance.setPassword("123");
        
        String expResult = "sukses";
        String result = instance.login_user();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);

    }
     /**
     * Test of Save_user method, of class TblUser.
     */
 @Test
    public void testSave_user() {
        System.out.println("Test Save User");
        
        TblUser instance = new TblUser();
        instance.setUssername("nawa");
        instance.setPassword("123");
        
        String expResult = "sukses";
        String result = instance.save_user();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
  
    }

    /**
     * Test of getAllRecords method, of class TblUser.
     */

         
    }