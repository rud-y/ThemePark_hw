import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.ParkingSpot;
import stalls.Stall;
import stalls.TobaccoStall;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    Visitor visitor;
    Dodgems dodgems;
    TobaccoStall tobaccoStall;
    Dodgems dodgems2;
    TobaccoStall tobaccoStall2;
    ThemePark themePark;
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;
    ArrayList<IReviewed> reviewed;

    @Before
    public void before() {
        visitor = new Visitor(14, 155.00, 20.00);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 7);
        dodgems = new Dodgems("Bumper Cars", 5);
        tobaccoStall2 = new TobaccoStall("Pearls", "Danny Durham", ParkingSpot.B2, 6);
        dodgems2 = new Dodgems("Wild Drive", 3);
        attractions.add(dodgems);
        attractions.add(dodgems2);
        stalls.add(tobaccoStall);
        stalls.add(tobaccoStall2);
        reviewed.add(dodgems);
        reviewed.add(dodgems2);
        themePark = new ThemePark(attractions, stalls);

    }

//    @Test
//    public void canReturnAllIReviewedObjects() {
//        assertEquals(2, themePark.getAllReviewed().size());
//    }
}
