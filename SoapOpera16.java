public class SoapOpera16 {
    public static void main(String[] args) {
        LinkedList<Integer> topList = new LinkedList<Integer>();
        LinkedList<Integer> botList = new LinkedList<Integer>();
        LinkedList<Integer> commonList = new LinkedList<Integer>();

        topList.add(235);
        topList.add(24);
        topList.add(1321);

        botList.add(432);
        botList.add(2111);

        commonList.add(232);
        commonList.add(13124);
        commonList.add(13214155);

        try {
            topList.append(commonList);
            botList.append(commonList);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int topSize = topList.getSize();
        int botSize = botList.getSize();

        System.out.println(findCommon(topList, botList, topSize, botSize));
    }

    static LinkedList<Integer> findCommon(
            LinkedList<Integer> topList,
            LinkedList<Integer> botList,
            int topSize, int botSize) {
        while (!topList.isEmpty() && !botList.isEmpty()) {
            if (topSize == botSize) {
                if (topList.equals(botList)) {
                    return topList;
                }
                else {
                    try {
                        topList.removeFirst();
                        topSize--;
                        botList.removeFirst();
                        botSize--;
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            else if (topSize > botSize) {
                try {
                    topList.removeFirst();
                    topSize--;
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            else {
                try {
                    botList.removeFirst();
                    botSize--;
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return null;
    }
}
