public class SoapOpera17 {
    public static void main(String[] args) {
        LinkedList<Integer> evenList = new LinkedList<Integer>();
        evenList.add(1);
        evenList.add(2);
        evenList.add(3);
        evenList.add(4);
        evenList.add(5);
        evenList.add(6);
        evenList.add(7);
        evenList.add(8);
        evenList.add(9);
        evenList.add(10);
        evenList.add(11);
        evenList.add(12);

        LinkedList<Integer> oddList = new LinkedList<Integer>();
        oddList.add(1);
        oddList.add(2);
        oddList.add(3);
        oddList.add(4);
        oddList.add(5);
        oddList.add(6);
        oddList.add(7);
        oddList.add(8);
        oddList.add(9);

        System.out.println(evenList.findMiddleNode());
        System.out.println(oddList.findMiddleNode());
    }
}
