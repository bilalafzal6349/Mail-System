# MailSystem Java Project

## Overview

This is a simple command-line email system written in Java. It allows users to sign in, send emails, and read inbox messages using a basic menu-driven interface.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Command-line terminal (e.g., Command Prompt, PowerShell, or Git Bash)

## Project Structure

```
MailSystem/
  ├─ src/
  │   ├─ Account.java
  │   ├─ MailItem.java
  │   ├─ MailServer.java
  │   ├─ Main.java
  │   └─ text.java
  └─ README.md
```

## How to Compile and Run

1. **Open a terminal and navigate to the project directory:**

   - On Windows with Git Bash or similar, use:
     ```sh
     cd /d/MailSystem
     ```

2. **Compile the Java source files:**

   ```sh
   javac -d out src/*.java
   ```

   - This will compile all Java files in the `src` folder and place the compiled `.class` files in the `out` directory.

3. **Run the program:**
   ```sh
   java -cp out Main
   ```

## Usage

- When you start the program, you will see a menu to sign in or exit.
- After signing in, you can send emails, read your inbox, sign out, or exit.
- Two test accounts are preloaded:
  - Username: `johnDoe`, Password: `password123`
  - Username: `janeDoe`, Password: `pass456`

## Troubleshooting

- If you see `javac: command not found` or `java: command not found`, make sure the JDK is installed and the `bin` directory is added to your system's PATH.
- If you get a directory error, ensure you are using the correct path format for your terminal (e.g., `/d/MailSystem` for Git Bash on Windows).

## License

This project is for educational purposes.
