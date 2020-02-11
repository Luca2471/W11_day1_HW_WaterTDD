import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }
    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void shouldSubtract10AfterEachDrink(){
        waterBottle.drinkWater();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void shouldEmptyTheWaterBottle(){
        waterBottle.emptyWater();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void shouldFillTheBottleFull(){
        waterBottle.fillBottleWithWater();
        assertEquals(100, waterBottle.getVolume());
    }

}

