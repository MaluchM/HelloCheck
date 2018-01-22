package sda.md;

public class CheckHello {

    public int check(String input, String searchWord) {

        int resultOfHello = 0;
        String ignoreUpperCase = input.toLowerCase();
        String[] tab = ignoreUpperCase.split("[.,/ ]");

        for (String word : tab) {
            if(word.equals(searchWord)) resultOfHello++;
        }

        return resultOfHello;
    }
}
