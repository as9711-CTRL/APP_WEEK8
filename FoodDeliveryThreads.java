class OrderProcessing extends Thread {
    public void run() {
        System.out.println(getName() + " | Priority: " + getPriority()
                + " | Processing customer order");
    }
}

class DeliveryTracking extends Thread {
    public void run() {
        System.out.println(getName() + " | Priority: " + getPriority()
                + " | Tracking delivery location");
    }
}

class Notification extends Thread {
    public void run() {
        System.out.println(getName() + " | Priority: " + getPriority()
                + " | Sending order notification");
    }
}

public class FoodDeliveryThreads {
    public static void main(String[] args) {
        OrderProcessing o = new OrderProcessing();
        DeliveryTracking d = new DeliveryTracking();
        Notification n = new Notification();

        o.setName("OrderProcessing");
        d.setName("DeliveryTracking");
        n.setName("Notification");

        o.setPriority(10);
        d.setPriority(5);
        n.setPriority(1);

        o.start();
        d.start();
        n.start();
    }
}