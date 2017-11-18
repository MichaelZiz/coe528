package coe528.project;

public class movies {

    /*OVERVIEW Movies class stores information on the movie(s) being stored, contains the title, number of seats for the movie 
 and the set ticket price of the movie*/
    String movieName;
    public int[] seats;
    private int seattotal;
    double ticketPrice;

    /* Abstraction Function:
        represents the movie titles, an integer array of number of seats and ticket price for movie 

        Rep Invariant:
        7 < seats.length < 11
        5 < double ticketPrice < 25
        
     */
    public movies(String movieName, int numseats, double ticketPrice) {
        /*
        Requires: a string of movieName that isnt null and length greater than 0, integer numSeats greater than 0, 
        double ticketprice greater than 0.  
        Modifies:new seat array based on number of set seats, sets ticketprice and movieName
        Effects: sets ticketprice, set movie name and seats in a movie array 
         */

        this.movieName = movieName;
        seats = new int[numseats];
        seattotal = numseats;

        for (int i = 0; i < seats.length; i++) {
            seats[i] = 0;

        }
        this.ticketPrice = ticketPrice;
        System.out.println(" Movie title: " + movieName + "\n Number of seats: " + numseats + "\n TicketPrice: " + ticketPrice);

    }

    public int getSeattotal() {
        /*
        Requires: no requirements 
        Modifies: no modifications
        Effects: returns total seats
         */
        return seattotal;
    }

    public String getMovie() {
        /*
        Requires: no requirements 
        Modifies: no modifications
        Effects: returns movieName
         */
        return movieName;

    }

    public double getTicketPrice() {
        /*
        Requires: no requirements 
        Modifies: no modifications
        Effects: returns ticketprice 
         */
        return ticketPrice;
    }

    public int SeatsAvailable() {
        /*
        Requires:no requirement
        Modifies: no modification
        Effects:counts the number of available seats for that particular movie
         */
        int count1 = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {

                count1++;

            } else {

            }

        }

        if (count1 <= 0) {
            System.out.println("movie full");
        }
        return count1;
    }

    @Override
    public String toString() {
        return " Movie title: " + movieName + "\n Number of seats: " + seats.length + "\n TicketPrice: " + ticketPrice;
    }

    public boolean repok() {
        if (seats.length > 0) {
            if (ticketPrice < 25 && ticketPrice > 5) {
                return true;
            }
        }
        return false;
    }

}
