package tema6_ex3;

interface Notifiable {
    void sendNotification(String message);

    default void logNotification(String message) {
        System.out.println("Log: notification sent -> " + message);
    }
}
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }

    // overloading
    public void displayInfo(boolean detailed) {
        if (detailed) {
            System.out.println("Detailed -> Name: " + name);
        } else {
            displayInfo();
        }
    }
}
class EmailUser extends User implements Notifiable {
    private String email;

    public EmailUser(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void displayInfo() {
        System.out.println("EmailUser: " + getName() + ", Email: " + email);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Email sent to " + email + ": " + message);
    }
}
class SMSUser extends User implements Notifiable {
    private String phoneNumber;

    public SMSUser(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("SMSUser: " + getName() + ", Phone: " + phoneNumber);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }
}
class AppUser extends User implements Notifiable {
    private String deviceId;

    public AppUser(String name, String deviceId) {
        super(name);
        this.deviceId = deviceId;
    }

    @Override
    public void displayInfo() {
        System.out.println("AppUser: " + getName() + ", Device: " + deviceId);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("App notification to " + deviceId + ": " + message);
    }
}
class Main {
    public static void main(String[] args) {
        EmailUser e = new EmailUser("Ana", "ana@email.com");
        SMSUser s = new SMSUser("Ion", "0712345678");
        AppUser a = new AppUser("Maria", "device123");

        e.displayInfo();
        e.displayInfo(true);
        e.sendNotification("Hello");
        e.logNotification("Hello");

        s.displayInfo();
        s.displayInfo(true);
        s.sendNotification("Hello");
        s.logNotification("Hello");

        a.displayInfo();
        a.displayInfo(true);
        a.sendNotification("Hello");
        a.logNotification("Hello");
    }
}
