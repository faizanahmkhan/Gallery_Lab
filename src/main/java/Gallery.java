import java.util.ArrayList;

public class Gallery {
    // name, till, collection of artwork

    private String name;
    private int till;
    private ArrayList<Artwork> artwork;


    public Gallery(String name, int till){
        this.name = name;
        this.till = 0;
    }
    public void acceptPayment(int payment) {
        setTill(till += payment);
    }

    public int getTill() {
                return till;
            }

    public void setTill(int till) {
        this.till = till;
           }



}
