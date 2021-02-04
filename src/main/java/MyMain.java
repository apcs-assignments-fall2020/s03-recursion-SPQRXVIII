public class MyMain {
    // This method adds up the values of all digits
    // in x, recursively
    public static int addDigits(int x) { 
        if(x%10==x){
            return x;
        }
        else{
            return x%10 + addDigits((x-x%10)/10);
        }
    }


    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    public static boolean isPalindrome(String str) { 
        // YOUR CODE HERE
        int l = str.length();
        if(l>1){
            boolean a = str.charAt(0)==str.charAt(l-1);
            return a&&isPalindrome(str.substring(1, l-1));
        }
        else{
            return true;
        }
        
    }

    // This method returns the orignal string reversed;
    // this method should be written using recursion
    public static String reverse(String str) { 
        // YOUR CODE HERE
        if(str.length()>1){
            return str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));
        }
        else{
            return str;
        }
    }

    public static void main(String[] args) {
        // You can test your code here
        System.out.println(addDigits(123));
        System.out.println(reverse("str"));
        if(isPalindrome("aba")){
            System.out.println("aba");
        }
    }
}
