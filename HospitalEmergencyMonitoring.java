class EmergencyAlert extends Thread {
    public void run() {
        System.out.println(getName() + " - Priority: " + getPriority());
        System.out.println("Critical patient alert!");
    }
}

class VitalMonitor extends Thread {
    public void run() {
        System.out.println(getName() + " - Priority: " + getPriority());
        System.out.println("Checking vital signs...");
    }
}

class ReportGenerator extends Thread {
    public void run() {
        System.out.println(getName() + " - Priority: " + getPriority());
        System.out.println("Generating routine report...");
    }
}

public class HospitalEmergencyMonitoring {
    public static void main(String[] args) {
        EmergencyAlert e = new EmergencyAlert();
        VitalMonitor v = new VitalMonitor();
        ReportGenerator r = new ReportGenerator();

        e.setName("EmergencyAlert");
        v.setName("VitalMonitor");
        r.setName("ReportGenerator");

        e.setPriority(Thread.MAX_PRIORITY); // 10
        v.setPriority(5);                   // Medium
        r.setPriority(Thread.MIN_PRIORITY); // 1

        e.start();
        v.start();
        r.start();
    }
}