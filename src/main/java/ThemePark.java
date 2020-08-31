import attractions.Attraction;
import behaviours.IReviewed;
import behaviours.ITicketed;
import stalls.Stall;

import java.util.ArrayList;

// implements IReviewed
public class ThemePark {
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
//    private ArrayList<IReviewed> reviews;


    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
              this.attractions = attractions;
              this.stalls = stalls;
    }


//    public int getRating() {
//        return this.attractions
//    }
//    public String getName() {
//
//    }


}
