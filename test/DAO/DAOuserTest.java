/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.TblUser;

/**
 *
 * @author USER
 */
public class DAOuserTest {
    
    public DAOuserTest() {
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

    @Test
    public void testRetrieveTblUser() {
        System.out.println("retrieveTblUser");
        DAOuser instance = new DAOuser();
        List<TblUser> result = instance.retrieveTblUser();
        assertThat(result, is(not(nullValue())));
            
    }

    @Test
    public void testGetbyID() {
        System.out.println("getbyID");
        String idU = "2";
        DAOuser instance = new DAOuser();
        List<TblUser> result = instance.getbyID(idU);
        assertThat(result, is(not(nullValue())));
        
    }

    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        Integer idU = null;
        DAOuser instance = new DAOuser();
        instance.deleteUser(idU);
     
    }

    @Test
    public void testEditUser() {
        System.out.println("editUser");
        TblUser usr = null;
        DAOuser instance = new DAOuser();
        instance.editUser(usr);
        
    }
    
}