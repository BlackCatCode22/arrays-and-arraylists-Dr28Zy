// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int [][] numberGrid = {
                {5, 10, 15},
                {20, 25, 30},
                {35, 40, 45},
                {50, 55, 60}

        };
        System.out.println( numberGrid[1][2]);

        for(int i = 0; i < numberGrid.length; i++) {

            for(int j = 0; j < numberGrid[i].length; j++) {
                System.out.println(numberGrid[i][j]);
            }
            System.out.println();
        }

        }
    }
