import java.util.Scanner;

public class Bibliotek {
    public static void main(String[] args) throws Exception {
        try (Scanner userInput = new Scanner(System.in)) {
            while (true) {
                System.out.print("Vad vill du göra?\n1. Add a book to the library\n2. Search for a book by name\n3. List all available books\n4. Return a book\n5. e = Quit \n");
                if (userInput.hasNext()) {
                    if (userInput.hasNextInt()) {
                        switch (userInput.nextInt()) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:

                                break;


                            default:
                                System.out.println("Alternativet finns inte.");
                                break;
                        }
                    } else {
                        if (userInput.nextLine().equals("e")) {
                            System.out.println("Hejdå.");
                            break;
                        }
                    }
                }
            }

        }
    }
}