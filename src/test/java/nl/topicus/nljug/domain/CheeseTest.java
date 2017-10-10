package nl.topicus.nljug.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheeseTest {
    @Test
    public void getName() throws Exception {


        Cheese cheese = new Cheese("brie", "franse kaas", 2.5);
        assertEquals("brie", cheese.getName());
    }

    @Test
    public void setName() throws Exception {
        Cheese cheese = new Cheese("brie", "franse kaas", 2.5);
        cheese.setName("goudse");
        assertEquals("goudse", cheese.getName());
    }

    @Test
    public void getDescription() throws Exception {
        Cheese cheese = new Cheese("brie", "franse kaas", 2.5);
        assertEquals("franse kaas", cheese.getDescription());
    }

    @Test
    public void setDescription() throws Exception {
        Cheese cheese = new Cheese("brie", "franse kaas", 2.5);
        cheese.setDescription("kaas uit NL");
        assertEquals("kaas uit NL", cheese.getDescription());
    }

    @Test
    public void getPrice() throws Exception {
        Cheese cheese = new Cheese("brie", "franse kaas", 2.5);
        assertEquals(2.5, cheese.getPrice(), 0.01);
    }

    @Test
    public void setPrice() throws Exception {
        Cheese cheese = new Cheese("brie", "franse kaas", 2.5);
        cheese.setPrice(3.5);
        assertEquals(3.5, cheese.getPrice(), 0.01);
    }

    @Test
    public void equals() throws Exception {
        Cheese cheese = new Cheese("brie", "franse kaas", 2.5);
        Cheese cheese2 = new Cheese("brie", "franse kaas", 2.5);
        assertEquals(cheese, cheese2);
    }
    @Test
            public void verifyHashCode() {

        Cheese cheese = new Cheese("brie", "franse kaas", 2.5);
        assertEquals(4, cheese.hashCode());
    }

}