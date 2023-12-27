public class App {
    public static void main(String[] args) throws Exception {
        // Just going to save this on github right here.
        int month = 3;
        String monthString;

        switch(month) {
            case 1: monthString = "Jan"; break;
            case 2: monthString = "Fen"; break;
            case 3: monthString = "March"; 
            System.out.println("Processing...");
            break;
            case 4: monthString = "Apr"; break;
            default: monthString = "May"; break;
            
        }
        System.out.println(monthString);
    }
}
