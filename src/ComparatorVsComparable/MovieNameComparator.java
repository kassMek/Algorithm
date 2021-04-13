package ComparatorVsComparable;

import java.util.Comparator;

public class MovieNameComparator  implements Comparator<Movie> {
    @Override
    public int compare (Movie movie1, Movie movie2) {

        //comparing by rating ...descending order
        if (movie1.getRating() < movie2.getRating()) return -1;
        if (movie1.getRating() > movie2.getRating()) return 1;
        else return 0;


        //ascending order
        //return (int) (movie1.getRating()-movie2.getRating());

        //return movie1.getName().compareTo(movie2.getName());
    }
}
