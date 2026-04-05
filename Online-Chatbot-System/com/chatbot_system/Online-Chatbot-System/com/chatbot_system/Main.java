package com.chatbot_system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChatBot bot = new ChatBot();
        ChatHistory history = new ChatHistory();

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Send Message");
            System.out.println("2. View History");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("You: ");
                    String input = sc.nextLine();

                    String reply = bot.getReply(input);

                    history.addMessage("You: " + input);
                    history.addMessage("Bot: " + reply);

                    System.out.println("Bot: " + reply);
                    break;

                case 2:
                    history.showHistory();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 3);

        sc.close();
    }
}
