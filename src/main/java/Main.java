public class Main {
    public static void main(String[] args) {

        Artwork artwork1 = new Artwork("Ocean","Milo",300,200);
        Customer customer1 = new Customer("Pepe" , 20000);



            System.out.println("Current funds: " + customer1.getWallet());

                customer1.subtractHeldMoney(artwork1.getPrice());
           // customer1.payGallery();
            System.out.println("Current funds: " + customer1.getWallet());
            
            
            
    }



}
