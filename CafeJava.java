public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 4.5;
        double latte = 3.0;
        double cappuccino = 3.2;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(customer1 + pendingMessage); 
        if (isReadyOrder4) {
            System.out.println(customer4+readyMessage+". "+displayTotalMessage+(latte*2.0));
        }
        else {
            System.out.println(customer4+pendingMessage);
        }
        System.out.println(customer3+readyMessage+". "+displayTotalMessage+(dripCoffee-latte));
    }
}
