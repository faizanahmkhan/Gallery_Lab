import java.util.ArrayList;

public class Artwork {

    private String title;

    private String artist;

    private int price;

    private int nft;

    private ArrayList<Artwork> artwork;


    public Artwork(String title, String artist, int price, int nft){
        this.artwork = new ArrayList<>();
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;

    }

        public int getPrice(){
            return price;
        }






}
