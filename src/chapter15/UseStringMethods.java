package chapter15;

public class UseStringMethods {

    public void printWords(String str) {
        String[] results = str.split(" ");
        for (String result : results) {
            System.out.println(result);
        }
    }

    public void findString(String str, String findStr) {
        int index = str.indexOf(findStr);
        System.out.println(String.format("string is appeared at %d", index));
    }

    public void findAnyCaseString(String str, String findStr) {
        int index = str.toLowerCase().indexOf(findStr);
        System.out.println(String.format("string is appeared at %d", index));
    }

    public void countChar(String str, char c) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (int i=0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println(String.format("char \'%s\' count is %d", c, count));
    }

    public void printContainsWords(String str, String findStr) {
        String[] result = str.split(" ");
        for (String r : result) {
            if (r.contains(findStr)) {
                System.out.println("class contains " + findStr);
            }
        }
    }

    public static void main(String[] args) {
        String s = "The String class represents character strings.";
        UseStringMethods useStringMethods = new UseStringMethods();
        useStringMethods.printWords(s);
        useStringMethods.findString(s, "string");
        useStringMethods.findAnyCaseString(s, "string");
        useStringMethods.countChar(s, 's');
        useStringMethods.printContainsWords(s, "ss");

        String s2 = "I am king";
        String s3 = "123123999";
        for (int i = 0; i < s3.length(); i++) {
            System.out.println(s3.charAt(i));
        }
    }
}
