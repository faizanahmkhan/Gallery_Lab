public class Customer {

    private String custName;

    private int wallet;
    private Gallery gallery;
    private Artwork artwork;

    public Customer (String custName, int wallet){
        this.custName = custName;
        this.wallet = wallet;
    }
    
        public int getWallet() {
            return wallet;
        }
        
        public void setWallet(int wallet) {
            this.wallet = (int) wallet;
        }
    
        public void subtractHeldMoney(int deduction) {
            setWallet(wallet - deduction);
        }

    /*
    public void payGallery() {
            if(this.wallet > artwork.getPrice()) {
                gallery.acceptPayment(artwork.getPrice());
                wallet -= artwork.getPrice();
            }
            else {
                System.out.println("You're broke. No art for you peasant.");
            }
        }
*/







}

