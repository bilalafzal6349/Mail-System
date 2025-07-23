import java.util.ArrayList;

public class MailServer {
    private ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<MailItem> emails = new ArrayList<>();

    // Method to add an account
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Authenticate a user
    public boolean authenticate(String username, String password) {
        for (Account account : accounts) {
            if (account.getuserName().equals(username) && account.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    // Send an email
    public void sendEmail(MailItem mail) {
        emails.add(mail);
        System.out.println("Email sent from " + mail.getFrom() + " to " + mail.getTo());
    }

    // Receive emails for a specific user
    public ArrayList<MailItem> getInbox(String username) {
        ArrayList<MailItem> inbox = new ArrayList<>();
        for (MailItem email : emails) {
            if (email.getTo().equals(username)) {
                inbox.add(email);
            }
        }
        return inbox;
    }

    // Display inbox emails
    public void displayInboxTitles(String username) {
        ArrayList<MailItem> inbox = getInbox(username);
        if (inbox.size() == 0) {
            System.out.println("Your inbox is empty.");
        } else {
            for (int i = 0; i < inbox.size(); i++) {
                System.out.println((i + 1) + ". " + inbox.get(i).getTitle());
            }
        }
    }

    // Get email by index
    public MailItem getEmail(String username, int index) {
        ArrayList<MailItem> inbox = getInbox(username);
        if (index >= 0 && index < inbox.size()) {
            return inbox.get(index);
        }
        return null;
    }
}