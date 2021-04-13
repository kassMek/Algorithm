package ComparatorVsComparable;

public class Movie implements Comparable<Movie> {
        private double rating;
        private String name;
        private int year;
        // Constructor
        public Movie (String nm, double rt, int yr) {

            this.name = nm;
            this.rating = rt;
            this.year = yr;
        }

        // Getter methods for accessing private data
        public double getRating () {
            return rating;
        }

    public String getName () {
        return name;
    }

    public int getYear (){
            return year;
        }

    // Used to sort movies by year
    public int compareTo(Movie m){
            //return this.getYear()-m.getYear();
            return this.getName().compareTo(m.getName());

        }

    @Override
    public String toString () {
        return "{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                ", year=" + year +
                "}";
    }
}


