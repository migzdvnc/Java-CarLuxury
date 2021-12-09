import java.util.Scanner;
public class UserCarRental {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        char chaf;
        
        System.out.print("Enter renter's name: ");
        String name = k.nextLine();
        
        System.out.print("Enter renter's age: ");
        int age = k.nextInt();
        
        System.out.print("Enter renter's zip code: ");
        int zip = k.nextInt();
        
        System.out.println("Car Sizes");
        System.out.println("[a] Sedan");
        System.out.println("[b] Minivan");
        System.out.println("[c] Coaster");
        System.out.println("[l] Luxury");
        
        System.out.print("Choice: ");
        char size = k.next().charAt(0);
        
        if (size == 'l'|| size == 'L') {
            System.out.print("with Chauffeur? [Y/N]: ");
             chaf = k.next().charAt(0);
        }
        else{
             chaf = 'n';
        }
        
        System.out.print("Days of Rental: ");
        int days = k.nextInt();
        System.out.println("");
        System.out.println("");
        
        LuxuryCarRental car = new LuxuryCarRental(name, age, zip, days, size, chaf);
        
        car.Display();
        
        
    }
}
