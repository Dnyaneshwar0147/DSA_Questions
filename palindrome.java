import java.util.Scanner;
public class palindrome {
   
    public boolean ispalindrome(int x) {
        if(x<0){
            return false;
        }
        int n = x;
        int revNum = 0;
        while(n>0){
            int d = n%10;
            revNum = revNum * 10 + d;
            n = n / 10;
        }
        if(revNum == x) {
            return true;
        } 
        else {
            return false;
        }
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome:");
        int number = sc.nextInt();

        palindrome p = new palindrome();
        System.out.println(p.ispalindrome(number)); // Output: true
        // System.out.println(p.ispalindrome(-121)); // Output: false
   
    }

    }

        
