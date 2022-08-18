import java.util.ArrayList;

public class Gallery {
    // name, till, collection of artwork

    private Gallery name;

    private int till;

    private ArrayList<Artwork> artwork;

    public void acceptPayment(int payment) {
        till += payment;
    }
    public void setTill() {
        this.till = till;
    }

}
