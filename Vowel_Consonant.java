import java.util.Scanner;

 class check{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    char inp = sc.next().charAt(0); // The character to be checked

        switch (inp) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(inp + " is a vowel.");
                break;
            default:
                System.out.println(inp + " is a consonant.");
                break;
        }
    }
}