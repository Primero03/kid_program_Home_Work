package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Place;

public class Holder {
 private List<Place> places;

    public Holder(int xSize, int ySize){
        places = new ArrayList<>(xSize*ySize);
        for(int x = 0; x < xSize; x++){
            for(int y = 0; y < ySize; y++){
                places.add(new Place(x, y));
            }
        }
    }

    public boolean release(int x, int y){
        return true;
       // return places.stream().filter(place -> place.getCol() == x && place.getRow() == y)
       //         .findFirst().get().setEmpty(true);
    }

    public int getBalance() {
        return 0;
    }

}
