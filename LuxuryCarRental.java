
public class LuxuryCarRental extends CarRental {
    protected char chaf;
    
    public LuxuryCarRental(String Name, int Age, int Zip, int Days, char Size, char Chaf){
    name = Name;
    age = Age;
    zip = Zip;
    days = Days;
    size = Size;
    chaf = Chaf;
    total = fee*days;
    
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
            case 'l':
                fee = 1200;
                break;
            default:
                fee = 0;
        }
        
     if(chaf == 'Y' || chaf == 'y'){
         total += 250*days;
     }
    }
    @Override
    public void Display(){
    
        System.out.println("Renter's Name: "+name);
        System.out.println("Renter's Age: "+age);
        System.out.println("Renter's Zip Code: "+zip);
        System.out.println("Size of Car: "+size);
        //if (chaf == 'Y' || chaf == 'y') {
         //   System.out.println("Chauffeur: 250");
        //}
        System.out.println("Days of Rental: "+days);
        System.out.println("Rental Fee: "+fee);
        System.out.println("Total: "+total);
    }
}
