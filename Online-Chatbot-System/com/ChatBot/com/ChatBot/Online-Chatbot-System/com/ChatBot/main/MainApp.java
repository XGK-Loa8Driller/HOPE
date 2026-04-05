package com.ChatBot.main;

import java.util.Scanner;

import com.ChatBot.model.*;
import com.ChatBot.service.ChatService;
import com.ChatBot.util.Validator;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ChatService service = new ChatService();
        ChatSession session = new ChatSession();

        int choice;

        do {
            System.out.println("\n--- CHATBOT MENU ---");
            System.out.println("1. Send Message");
            System.out.println("2. View Chat");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("You: ");
                    String input = sc.nextLine();

                    if (!Validator.isValidInput(input)) {
                        System.out.println("Invalid input!");
                        break;
                    }

                    UserMessage userMsg = new UserMessage(input);
                    session.addMessage(userMsg);

                    String reply = service.getReply(input);

                    BotMessage botMsg = new BotMessage(reply);
                    session.addMessage(botMsg);

                    System.out.println(botMsg.format());
                    break;

                case 2:
                    session.showChat();
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
