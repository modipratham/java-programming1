
import static java.lang.Math.abs;


public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared){
        if(this.squares>compared.squares){
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment compared){
        return abs(this.squares*this.princePerSquare-compared.princePerSquare*compared.squares);
    }
    public boolean moreExpensiveThan(Apartment compared){
        if(this.squares*this.princePerSquare-compared.princePerSquare*compared.squares>0)
        {
            return true;
        }
        return false;
    }

}
