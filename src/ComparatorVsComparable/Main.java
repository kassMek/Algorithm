package ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main (String[] args) {
        List<LapTop> list = new ArrayList<>();
         list.add( new LapTop("DELL",123,1230));
        list.add( new LapTop("Apple",300,4230));
        list.add( new LapTop("HP",250,1800));
        list.add( new LapTop("Lenovo",275,3500));
        Collections.sort(list);
        for(LapTop ll:list) {
            System.out.println(ll);
        }

        ArrayList<Movie> moveList = new ArrayList<Movie>();
        moveList.add(new Movie("Force Awakens", 8.3, 2015));
        moveList.add(new Movie("Star Wars", 8.7, 1977));
        moveList.add(new Movie("Empire Strikes Back", 8.8, 1980));
        moveList.add(new Movie("Return of the Jedi", 8.4, 1983));

        //Collections.sort(moveList); // using comparable
        Collections.sort(moveList, new MovieNameComparator()); //using comparator
//        for(Movie mm:moveList) {
//            System.out.println(mm);
//        }

    }
}

