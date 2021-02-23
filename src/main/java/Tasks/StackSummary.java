package Tasks;

import java.util.ArrayList;
import java.util.List;

public class StackSummary {
    List<String> list_L = new ArrayList<String>();
    List<String> list_M = new ArrayList<String>();


    public static void main(String[] args) {
        String[] art = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String[] cd = new String[]{"A", "B"};
        System.out.println(stockSummary(art, cd));
    }

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        String result = "";
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return result;
        }
        for (String letter : lstOf1stLetter) {
            Integer amountOfBooks = 0;
            for (String data : lstOfArt) {
                if (data.charAt(0) == letter.charAt(0)) {
                    amountOfBooks += Integer.parseInt(data.split(" ")[1]);
                }
            }
            result += "(" + letter + " : " + amountOfBooks + ")" + " - ";
        }
        if (result.endsWith(" - ")) {
            result = result.substring(0, result.length() - 3);
        }
        return result;
    }
}
