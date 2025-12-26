import java.util.Scanner;
class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the your Name: ");
        String name = scanner.next();  
        System.out.println("Hello, " + name + "!");
        scanner.close();
        
    }
}