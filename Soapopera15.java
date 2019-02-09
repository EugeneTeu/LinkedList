public class SoapOpera15 {
    public static void main(String[] args) {
        LinkedList<Integer> topList = new LinkedList<Integer>();
        LinkedList<Integer> botList = new LinkedList<Integer>();
        LinkedList<Integer> commonList = new LinkedList<Integer>();

        topList.add(1);
        topList.add(1);
        topList.add(3);
        topList.add(2);

        botList.add(5);
        botList.add(4);
        botList.add(3);

        commonList.add(20);
        commonList.add(37);
        commonList.add(25);

        topList.append(commonList);
        botList.append(commonList);

        System.out.println(findCommon(topList, botList));
    }

    static LinkedList<Integer> findCommon(
            LinkedList<Integer> topList, 
            LinkedList<Integer> botList) {
        int topListInitial = topList.getSize();
        int botListInitial = botList.getSize();
        int maxNodes = topListInitial + botListInitial;
        Integer[] EleArr = new Integer[maxNodes];
        
        int i = 0;
        int actualUniqueNodes = 0;
        int count = 0;
        while (!topList.isEmpty()) {
            EleArr[i] = topList.getFirst();
            topList.removeFirst();
            actualUniqueNodes++;
            i++;
        }
        while (true) {
            Integer temp = botList.getFirst();

        }   
    }
}
