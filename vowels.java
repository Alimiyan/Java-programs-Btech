import java.util.Scanner;

class vowels{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=s.next().charAt(0);
        switch(ch){
            case 'a':System.out.println("character is vowel");
            break; 
            case 'e':System.out.println("character is vowel");
            break;
            case 'i':System.out.println("character is vowel");
            break;
            case 'o':System.out.println("character is vowel");
            break;
            case 'u':System.out.println("character is vowel");
            break;
            default:System.out.println("character is not vowel");
            break;
            }
        }
    } 