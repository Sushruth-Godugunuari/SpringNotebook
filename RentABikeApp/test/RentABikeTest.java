
import junit.framework.TestCase;

import com.springbook.RentABike;
import com.springbook.ArrayListRentABike;
import com.springbook.Bike;

import java.util.List;


public class RentABikeTest extends TestCase {
    private RentABike  rentaBike;

    public void setUp() throws Exception {
        super.setUp();
        rentaBike = new ArrayListRentABike("Bruce's Bike");
    }

    public void testGetGame() {
        assertEquals("Bruce's Bike", rentaBike.getStoreName());
    }

    public void testGetBike() {
        Bike bike = rentaBike.getBike("11111");
        assertNotNull(bike);
        assertEquals("Shimano", bike.getManufacturer());
    }

    public void testGetBikes() {
        List bikes = rentaBike.getBikes();
        assertNotNull(bikes);
        assertEquals(3, bikes.size());
    }
}
