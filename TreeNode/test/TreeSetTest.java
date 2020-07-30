/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import treenode.TreeSet;

/**
 *
 * @author matias
 */
public class TreeSetTest {
    TreeSet<String> stringTreeSet1;
    TreeSet<String> stringTreeSet2;
    TreeSet<String> stringTreeSet3;
    TreeSet<String> stringTreeSet4;
    TreeSet<Integer> integerTreeSet1;
    TreeSet<Integer> integerTreeSet2;
    TreeSet<Integer> integerTreeSet3;
    TreeSet<Integer> integerTreeSet4;
    
    public TreeSetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
      
    @After
    public void tearDown() {
    }


    

    @Before
    public void setUp() throws Exception {
        stringTreeSet1 = new TreeSet<>();
        stringTreeSet2 = new TreeSet<>();
        stringTreeSet2.add("a");
        stringTreeSet3 = new TreeSet<>();
        stringTreeSet3.addAll(Arrays.asList("m", "r", "p", "z", "g", "k", "a"));
        stringTreeSet4 = new TreeSet<>();
        stringTreeSet4.addAll(Arrays.asList("d", "c", "e", "b", "f", "a", "g"));

        integerTreeSet1 = new TreeSet<>();
        integerTreeSet1.addAll(Arrays.asList(22, 30, 25, 35, 10, 5, 33, 15, 12,
                40, 17, 19, 20, 18, 16));
        integerTreeSet2 = new TreeSet<>();
        integerTreeSet2.addAll(Arrays.asList(8, 1, 7, 2, 6, 3, 5, 4));
        integerTreeSet3 = new TreeSet<>();
        integerTreeSet3.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
                12, 13, 14, 15));
        integerTreeSet4 = new TreeSet<>();
        integerTreeSet4.addAll(Arrays.asList(8, 4, 12, 2, 6, 1, 5, 3, 7, 10,
                11, 14, 15, 9, 13));
    }

    @Test
    public void testHeight() {
        assertEquals(-1, stringTreeSet1.height());
        assertEquals(0, stringTreeSet2.height());
        assertEquals(2, stringTreeSet3.height());
        assertEquals(3, stringTreeSet4.height());
        assertEquals(5, integerTreeSet1.height());
        assertEquals(7, integerTreeSet2.height());
        assertEquals(14, integerTreeSet3.height());
        assertEquals(3, integerTreeSet4.height());
    }

    @Test
    public void testIsFull() {
        assertTrue(stringTreeSet1.isFull());
        assertTrue(stringTreeSet2.isFull());
        assertTrue(stringTreeSet3.isFull());
        assertFalse(stringTreeSet4.isFull());
        assertTrue(integerTreeSet1.isFull());
        assertFalse(integerTreeSet2.isFull());
        assertFalse(integerTreeSet3.isFull());
        assertTrue(integerTreeSet4.isFull());
    }

    @Test
    public void testLeafCount() {
        assertEquals(0, stringTreeSet1.leafCount());
        assertEquals(1, stringTreeSet2.leafCount());
        assertEquals(4, stringTreeSet3.leafCount());
        assertEquals(2, stringTreeSet4.leafCount());
        assertEquals(8, integerTreeSet1.leafCount());
        assertEquals(1, integerTreeSet2.leafCount());
        assertEquals(1, integerTreeSet3.leafCount());
        assertEquals(8, integerTreeSet4.leafCount());
    }

    @Test
    public void testIsPerfect() {
        assertTrue(stringTreeSet1.isPerfect());
        assertTrue(stringTreeSet2.isPerfect());
        assertTrue(stringTreeSet3.isPerfect());
        assertFalse(stringTreeSet4.isPerfect());
        assertFalse(integerTreeSet1.isPerfect());
        assertFalse(integerTreeSet2.isPerfect());
        assertFalse(integerTreeSet3.isPerfect());
        assertTrue(integerTreeSet4.isPerfect());
    }

    @Test
    public void testIsDegenerate() {
        assertFalse(stringTreeSet1.isDegenerate());
        assertFalse(stringTreeSet2.isDegenerate());
        assertFalse(stringTreeSet3.isDegenerate());
        assertFalse(stringTreeSet4.isDegenerate());
        assertFalse(integerTreeSet1.isDegenerate());
        assertTrue(integerTreeSet2.isDegenerate());
        assertTrue(integerTreeSet3.isDegenerate());
        assertFalse(integerTreeSet4.isDegenerate());
    }
}

