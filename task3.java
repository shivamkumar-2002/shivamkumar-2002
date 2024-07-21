import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hello! How can I assist you today?");
        
        while (true) {
            String userMessage = scanner.nextLine().toLowerCase();
            
            if (userMessage.contains("hello")) {
                System.out.println("Chatbot: Hi there!");
            } else if (userMessage.contains("how are you")) {
                System.out.println("Chatbot: I'm just a program, so I don't have feelings, but thanks for asking!");
            } else if (userMessage.contains("bye")) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break;
            } else {
                System.out.println("Chatbot: I'm not sure how to respond to that. Can you ask me something else?");
            }
        }
    }
}