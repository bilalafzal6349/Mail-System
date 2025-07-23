public class MailItem {
    private String to;     // Recipient
    private String from;   // Sender
    private String title;  // Email subject
    private String message; // Email content

    // Constructor
    public MailItem(String to, String from, String title, String message) {
        this.to = to;
        this.from = from;
        this.title = title;
        this.message = message;
    }

    // Display email content
    public void display() {
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
    }

    // Getters
    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }
}