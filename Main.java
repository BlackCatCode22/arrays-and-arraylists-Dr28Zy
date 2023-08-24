// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int [] myNumbers = new int[8];

        myNumbers[0] = 1;
        myNumbers[1] = 3;
        myNumbers[2] = 5;
        myNumbers[3] = 7;
        myNumbers[4] = 9;
        myNumbers[5] = 11;
        myNumbers[6] = 13;
        myNumbers[7] = 15;

        System.out.println("myklhashnumbers[0] = " + myNumbers[3] );

        for (int i = 0; i < 8; i++ ) {

            System.out.println("myNumbers[" + i + "] is: " + myNumbers[i]);
        }

        // fill the array with 5, 10, 15, etc.
        int myFiveContainer = 5; 
        for (int i = 0; i < 8; i++) {

           myNumbers[i] = myFiveContainer += 5;
        }

        String [] friends = new String[3];

        friends[0] = "Mike";
        friends[1] = "Karen";
        friends[2] = "Kevin";

        System.out.println( friends[0]);
        System.out.println( friends[1]);
        System.out.println( friends[2]);
        }
    }
