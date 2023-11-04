import java.util.Scanner;
public class Palindrom {

    static boolean isPalindrome(int number){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        number= input.nextInt();
        int lastNumber,temp,reverseNumber=0;
        temp=number;
        while (temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp /=10;
        }
        if(number==reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
