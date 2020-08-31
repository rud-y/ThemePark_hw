package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() {
        visitor = new Visitor(13, 144.00, 20.00);
        visitor2 = new Visitor(18, 201.00, 20.00);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isEligibleToUseRollerCoaster() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void canChargeDoubleFeeIfTallerThan200() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.01);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.01);
    }
    @Test
    public void canChargeDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }
}
