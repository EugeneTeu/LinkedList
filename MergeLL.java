public class MergeLL {
    public static void main(String[] args) {
        LinkedList<Integer> firstList = new LinkedList<Integer>();
        LinkedList<Integer> secondList = new LinkedList<Integer>();
        
        firstList.add(1);
        firstList.add(3);
        firstList.add(4);
        firstList.add(5);
        firstList.add(5);
        firstList.add(7);

        secondList.add(2);
        secondList.add(2);
        secondList.add(3);
        secondList.add(3);
        secondList.add(5);
        secondList.add(6);
        try {
            LinkedList<Integer> thirdList = firstList.merge(secondList);    
            System.out.println("thirdList: " + thirdList);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("firstList: " + firstList);
        System.out.println("secondList: " + secondList);
    }
}
