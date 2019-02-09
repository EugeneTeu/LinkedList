public class TestReverse {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        LinkedList<Integer> listTwo = new LinkedList<Integer>();
        listTwo.add(14);
        listTwo.add(15);
        listTwo.add(16);
        listTwo.add(17);
        
        list.reverse();
        listTwo.nonRecursiveReverse();

        System.out.println("Recursive result: " + list);
        System.out.println("Non-recursive result: " + listTwo);
    }
}
