public class App {
    public static void main(String[] args) throws Exception {

       Scanner scan = Scanner(System.in);

       int customers = 22;
       for (int i=1; i<=customers; i++){
        System.out.println("Customer No "+i);
        System.out.println("Enter Credit Limit, Price and Quantity info:");


        double CreditLimit = scan.nextDouble();
        int Price=scan.nextInt();
        int Quantity=scan.nextInt();


           int ValueOfGoods = Price * Quantity;
           while(ValueOfGoods > CreditLimit){
            System.out.println(" Sorry you cannot purchase goods worthy such a value on credit.");
            System.out.println(" Try a lower quantity.");
            int quantity = scan.nextInt();
            int valueOfGoods = Price*Quantity;
           }



         System.out.println("Thank you for purchasing from us:" +"KSh." + ValueOfGoods);
        
       }
    }
}