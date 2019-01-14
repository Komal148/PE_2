public class ReversePalindrome {
    String palCheck(String str) {

        String reverseStr = "";
        int length = str.length();
        for (int i = length - 1 ; i >= 0 ; i--)
            reverseStr = reverseStr + str.charAt(i);

        if(reverseStr.equals(str))
        {
            return (str + " is a palindrome");
        }
        else
        {
            return (str + " is not a palindrome");
        }
    }
}