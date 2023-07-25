import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);
        int count = 0;

        StringBuilder sentence = new StringBuilder(Reader.nextLine());

        System.out.println(sentence.toString().replace(" " , "%"));

    }
}
