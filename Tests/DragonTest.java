package Tests;
import org.junit.Before;
import org.junit.Test;

import models.Dragon;

public class DragonTest {

    Dragon dragon;
   
    @Before
    public void setup() {
        dragon = new Dragon("Gore Magala");
    }
    
    @Test
    public void dragonTest() {
        System.out.println(dragon.getGender());
    }
}
