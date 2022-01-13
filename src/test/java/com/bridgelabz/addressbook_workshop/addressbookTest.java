package com.bridgelabz.addressbook_workshop;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class addressbookTest 
{
    Addressbook addresstest = new Addressbook();
    
    @Before
    public void initializeClass(){
    	addresstest = new Addressbook();
    }
    @Test
    public void givenListOfContactsWhenAddedShouldReturnNumberOfContacts(){
    	int size = addresstest.addContact().size();
        Assert.assertEquals(1,size);
    }
    
    @Test
    public void givenListOfContactsWhenAddedShouldReturnWrongNumberOfContacts(){
    	int size = addresstest.addContact().size();
        Assert.assertEquals(0,size);
    }
          
    	
}
