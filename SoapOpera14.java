public class SoapOpera14 {
    public static void main(String[] args) {
        LinkedList<Integer> actualCommonList = new LinkedList<Integer>();
        actualCommonList.add(6);
        actualCommonList.add(7);
        actualCommonList.add(8);

        LinkedList<Integer> topList = new LinkedList<Integer>();
        topList.add(1);
        topList.add(2);
        topList.add(3);

        LinkedList<Integer> botList = new LinkedList<Integer>();
        botList.add(4);
        botList.add(5);

        try {
            topList.append(actualCommonList);
            botList.append(actualCommonList);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        LinkedList<Integer> unjointList = new LinkedList<Integer>();
        unjointList.add(10);
        unjointList.add(11);
        unjointList.add(12);
        unjointList.add(13);

        LinkedList<Integer> commonList = findCommon(topList, botList);
        System.out.println(commonList);

        System.out.println(findCommon(actualCommonList, unjointList));
    }

    static LinkedList<Integer> findCommon(
            LinkedList<Integer> topList,
            LinkedList<Integer> botList) {
        while (!topList.isEmpty() && !botList.isEmpty()) {
            if (topList.getFirst().intValue() == botList.getFirst().intValue()) {
                return topList;
            }
            else if (topList.getFirst().intValue() > botList.getFirst().intValue()){
                try {
                    botList.removeFirst();
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            else {
                try {
                    topList.removeFirst();
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return null;
    }
}
