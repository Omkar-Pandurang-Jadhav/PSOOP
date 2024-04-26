// Interface for TakeAway

interface TakeAway {
    void dispatchOrder();
}

// Interface for EatItHere
interface EatItHere {
    void deliverOrder();
}

// Class representing a Consumer inheriting both TakeAway and EatItHere interfaces
class Consumer implements TakeAway, EatItHere {
    // Data members for order number and order price
    private int orderNumber;
    private double orderPrice;

    // Constructor to initialize order number and order price
    public Consumer(int orderNumber, double orderPrice) {
        this.orderNumber = orderNumber;
        this.orderPrice = orderPrice;
    }

    // Method to dispatch order for takeaway
    @Override
    public void dispatchOrder() {
        double convenienceFee = Math.max(45, 0.05 * orderPrice); // Convenience fee of Rs. 45/- or 5% of order price (whichever is more)
        double totalCharge = orderPrice + convenienceFee;
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Total Charge for Takeaway: Rs. " + totalCharge);
    }

    // Method to deliver order for eating in
    @Override
    public void deliverOrder() {
        double serviceCharge = Math.min(500, 0.1 * orderPrice); // Service charge of Rs. 500/- or 10% of order price (whichever is lower)
        double totalCharge = orderPrice + serviceCharge;
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Total Charge for Eating In: Rs. " + totalCharge);
    }
}

public class HotelOrder {
    public static void main(String[] args) {
        // Creating a Consumer object for takeaway with order number 1 and order price of Rs. 1000/-
        Consumer takeawayConsumer = new Consumer(1, 1000);

        // Creating a Consumer object for eating in with order number 2 and order price of Rs. 1500/-
        Consumer eatInConsumer = new Consumer(2, 1500);

        // Dispatching order for takeaway
        takeawayConsumer.dispatchOrder();

        // Delivering order for eating in
        eatInConsumer.deliverOrder();
    }
}
