import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> testList = new LinkedList<String>();
        while (true) {
            String input = sc.next();
            if (input.equals("exit")) {
                break;
            }
            else {
                testList.add(input);
            }
        }
        
        printStatus(testList);
        
        testList.addAt(1, "hello");
        
        printStatus(testList);
        
        //System.out.println(testList.contains("5"));

        /*
        try { 
            testList.remove();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Size after remove: " + testList.getSize());
        System.out.println(testList);
        */
    }

    static void printStatus(LinkedList<String> testList) {
        System.out.println("Size: " + testList.getSize());
        System.out.println(testList);
    }
}
