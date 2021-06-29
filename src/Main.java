import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Palindrom veya olmadığını anlamak için bir şeyler yazınız:");
    String input = s.nextLine();

    System.out.println("Girdiğiniz " + isPalindrome(input));

    }

    static String isPalindrome(String str)
    {

        int s = 0;
        int e = str.length() - 1;

        while (s < e)
        {
            if (str.charAt(s) != str.charAt(e))
            {
                return "palindrom değildir.";
            }
            s++;e--;
        }

        return "palindromdur.";

    }
}
