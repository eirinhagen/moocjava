package ComparingApartments;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;


    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public int getPricePerSquare() {
        return pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int price() {
        return pricePerSquare * squares;
    }

    public int priceDifference(Apartment compared) {
        /*int priceMain = this.pricePerSquare * this.squares;
        int priceCompared = compared.pricePerSquare * compared.squares;*/
          /*  int priceDifference = 0;
            if(priceMain > priceCompared){
              priceDifference = priceMain - priceCompared;
               return priceDifference;
            }
            if (priceCompared > priceMain) {
                 priceDifference = priceCompared-priceMain;
                return priceDifference;
            }*/
        int priceDifference = Math.abs(this.price() - compared.price());
        return priceDifference;
    }

    public boolean moreExpensive(Apartment compared) {
        return this.price() > compared.price();

    }
}
