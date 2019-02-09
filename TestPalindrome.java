public class TestPalindrome {
    public static void main(String[] args) {
        LinkedList<Character> charList = new LinkedList<Character>();

        charList.add(new Character('a'));
        charList.add(new Character('b'));
        charList.add(new Character('c'));
        charList.add(new Character('d'));
        charList.add(new Character('d'));
        charList.add(new Character('c'));
        charList.add(new Character('b'));
        charList.add(new Character('a'));

        LinkedList<Character> oddList = new LinkedList<Character>();
        
        oddList.add(new Character('a'));
        oddList.add(new Character('b'));
        oddList.add(new Character('c'));
        oddList.add(new Character('d'));
        oddList.add(new Character('c'));
        oddList.add(new Character('b'));
        oddList.add(new Character('a'));

        LinkedList<Character> controlList = new LinkedList<Character>();

        controlList.add(new Character('a'));
        controlList.add(new Character('b'));
        controlList.add(new Character('c'));
        controlList.add(new Character('d'));

        if (charList.isPalindrome()) {
            System.out.println(charList + " is a palindrome.");
        }
        else {
            System.out.println(charList + " is not a palindrome.");
        }
        if (oddList.isPalindrome()) {
            System.out.println(oddList + " is a palindrome.");
        }
        else {
            System.out.println(oddList + " is not a palindrome.");
        }
        if (controlList.isPalindrome()) {
            System.out.println(controlList + " is a palindrome.");
        }
        else {
            System.out.println(controlList + " is not a palindrome.");
        }
    }
}
