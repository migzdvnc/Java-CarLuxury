
public class CarRental {
    protected String name;
    protected int age, zip, days;
    protected double fee, total;
    protected char size;
    
    public void CarRental(String Name, int Age, int Zip, int Days, char Size){
    
        name = Name;
        age = Age;
        zip = Zip;
        days = Days;
        size = Size;
        total = fee * days;
        
        switch(size){
            case 'a':
                fee = 100;
                break;
            case 'b':
                fee = 250;
                break;
            case 'c':
                fee = 300;
                break;
            default:
                fee = 0;
        }
    }
    public void Display(){
        System.out.println("Renter's name: "+name);
        System.out.println("Renter's age: "+age);
        System.out.println("Renter's zip code: "+zip);
        System.out.println("Car's size: "+size);
        System.out.println("Rental Fee: "+fee);
        System.out.println("Days of Rental: "+days);
        System.out.println("Total: "+total);
        
        
        
        }
        
    }

