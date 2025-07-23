import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MailServer mailServer = new MailServer();
        String currentUser = null;

        // Adding test accounts
        mailServer.addAccount(new Account("johnDoe", "password123", "gmail.com"));
        mailServer.addAccount(new Account("janeDoe", "pass456", "yahoo.com"));

        boolean exit = false;

        while (!exit) {
            if (currentUser == null) {
                System.out.println("\n--- Email System ---");
                System.out.println("1. Sign In");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter username: ");
                        String username = scanner.nextLine();
                        System.out.print("Enter password: ");
                        String password = scanner.nextLine();

                        if (mailServer.authenticate(username, password)) {
                            currentUser = username;
                            System.out.println("Signed in as " + currentUser);
                        } else {
                            System.out.println("Invalid username or password.");
                        }
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            } else {
                System.out.println("\n--- Email System ---");
                System.out.println("1. Sign Out");
                System.out.println("2. Send Email");
                System.out.println("3. Read Inbox Emails");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        currentUser = null;
                        System.out.println("Signed out.");
                        break;
                    case 2:
                        sendEmail(scanner, mailServer, currentUser);
                        break;
                    case 3:
                        readInbox(scanner, mailServer, currentUser);
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            }
        }
        scanner.close();
    }

    private static void sendEmail(Scanner scanner, MailServer mailServer, String from) {
        System.out.print("Enter recipient's username: ");
        String to = scanner.nextLine();
        System.out.print("Enter email title: ");
        String title = scanner.nextLine();
        System.out.print("Enter email message: ");
        String message = scanner.nextLine();

        MailItem mail = new MailItem(to, from, title, message);
        mailServer.sendEmail(mail);
    }

    private static void readInbox(Scanner scanner, MailServer mailServer, String username) {
        mailServer.displayInboxTitles(username);
        System.out.print("Enter the index of the email to read (or -1 to go back): ");
        int index = scanner.nextInt() - 1;

        if (index >= 0) {
            MailItem mail = mailServer.getEmail(username, index);
            if (mail != null) {
                mail.display();
            } else {
                System.out.println("Invalid index.");
            }
        }
    }
}1