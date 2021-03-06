package coe528.project;
   /**OVERVIEW Movies class stores information on the movie(s) being stored, contains the title, number of seats for the movie 
     * and the set ticket price of the movie. This class is mutable as the number of available seats can change.
    **/
public class movies {

    
    String movieName;
    public int[] seats;
    private int seattotal;
    double ticketPrice;

       /**
        *Requires: a string of movieName that isn't null and length greater than 0, integer numSeats greater than 0, 
        *double ticketPrice greater than 0.  
        *Modifies:new seat array based on number of set seats, sets ticketPrice and movieName
        *Effects: sets ticketPrice, set movie name and seats in a movie array 
         **/
    public movies(String movieName, int numseats, double ticketPrice) {
        
        this.movieName = movieName;
        seats = new int[numseats];
        seattotal = numseats;

        for (int i = 0; i < seats.length; i++) {
            seats[i] = 0;

        }
        this.ticketPrice = ticketPrice;
        System.out.println(" Movie title: " + movieName + "\n Number of seats: " + numseats + "\n TicketPrice: " + ticketPrice);

    }
        /**
        *Requires: no requirements 
        *Modifies: no modifications
        *Effects: returns total seats
         **/
    public int getSeattotal() {
        
        return seattotal;
    }
        /**
        *Requires: no requirements 
        *Modifies: no modifications
        *Effects: returns movieName
         **/
    public String getMovie() {
       
        return movieName;

    }
       /**
        *Requires: no requirements 
        *Modifies: no modifications
        *Effects: returns ticketPrice 
         **/
    public double getTicketPrice() {
        
        return ticketPrice;
    }
       /**
        *Requires:no requirement
        *Modifies: no modification
        *Effects:counts the number of available seats for that particular movie
         **/
    public int SeatsAvailable() {
       
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
   /**Abstraction Function:
      * represents the movie titles, an integer array of number of seats and ticket price for movie  
     **/
    @Override
    public String toString() {
        return " Movie title: " + movieName + "\n Number of seats: " + seats.length + "\n TicketPrice: " + ticketPrice;
    }
    /**Rep Invariant:
      * 7 < seats.length < 11
      * 5 < double ticketPrice < 25  
     **/
    public boolean repok() {
        if (seats.length > 0) {
            if (ticketPrice < 25 && ticketPrice > 5) {
                return true;
            }
        }
        return false;
    }

}
