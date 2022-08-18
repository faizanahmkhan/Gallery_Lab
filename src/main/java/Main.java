public class Main {
    public static void main(String[] args) {

        Artwork artwork1 = new Artwork("Ocean","Milo",300,200);
        Customer customer1 = new Customer("Pepe" , 20000);
        Gallery gallery1 = new Gallery("Gallery", 0);



            System.out.println("Customer funds available: " + customer1.getWallet());

                customer1.subtractHeldMoney(artwork1.getPrice());
           // customer1.payGallery();
            System.out.println("Payment Complete. New customer funds available: " + customer1.getWallet());

            gallery1.acceptPayment(artwork1.getPrice());

            System.out.println("Gallery till: " + gallery1.getTill());

            
            
    }



}
