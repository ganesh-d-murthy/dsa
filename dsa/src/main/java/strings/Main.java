public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "dodsasdok";
        longestPal(s);
    }

    static int longestPal(String s) {
        int low,high;
        int start =0, end = 1;
        for (int i =0; i< s.length(); i++) {
            //System.out.println(s.charAt(i));
            low = i;
            high = i + 1;
            System.out.println("even low" + low + " " + "high" + high);
            while(low >=0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                System.out.println("match even" + low + " " + s.charAt(low) + " " + high + " " + s.charAt(high));
                if(high - low + 1 > end) {
                    start = low;
                    end = high - low + 1;
                }
                low--;
                high++;
            }
            low = i;
            high = i + 2;
            System.out.println("odd low" + low + " " + "high" + high);
            while(low >=0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                System.out.println("match odd " + low + " " + s.charAt(low) + " " + high + " " + s.charAt(high));
                if(high - low + 1 > end) {
                    start = low;
                    end = high - low + 1;
                }
                low--;
                high++;
            }
            System.out.println("start " + start + " end " + end);
        }

        System.out.println(s.substring(start, end + 1));
        System.out.println(s.substring(start, end + 1) + " is Palin" + isPalindrome(s.substring(start, end + 1)));
        System.out.println("madam " + isPalindrome("madam"));
        System.out.println("hello " + isPalindrome("hello"));
        return 0;
    }

    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            System.out.println(left + " " + right + " " + s.charAt(left) + " " + s.charAt(right));
            left++;
            right--;
        }
        return true;
    }
}
