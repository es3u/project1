
////////Essa Almutiri


import java.util.Scanner;
import java.util.Random;
public class Main {

     static char[][] array2D = new char[3][3];
     static char user;
     static Random R = new Random();

    public static void main(String[] args) {



        arrayXO();
        game();


    }



    public static void arrayXO() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array2D[i][j] =  (char)('1' + (i * 3 + j));
            }
        }
        user = 'X';
    }


    public static void displayWindow() {
        System.out.println("Display the window");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }



    public  static void game() {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            displayWindow();
            if (user == 'X') {

                do {
                    System.out.print("Enter  number from 1-9  ");
                    num = scanner.nextInt();
                } while (!checkNum(num));
            } else {

                do {
                    num = R.nextInt(10);
                } while (!checkNum(num));
                System.out.println("Computer (O) chose: " + num);
            }

            if (checkWinner()) {
                displayWindow();
                System.out.println("The winners is: " + user);
                break;
            }

            if (arrayF()) {
                displayWindow();
                System.out.println("The game ended in a draw..");
                break;
            }


            if (user == 'X') {
                user = 'O';
            } else {
                user = 'X';
            }

        }

    }









    public  static boolean checkNum(int num2) {
        int row = (num2 - 1) / 3;
        int col = (num2 - 1) % 3;


        if (num2 < 1 || num2 > 9 || array2D[row][col] == 'X' || array2D[row][col] == 'O') {
            System.out.println("Incorrect, try again .");
            return false;
        }else{
        array2D[row][col] = user;
        return true;}
    }









    public static boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if ((array2D[i][0] == user && array2D[i][1] == user && array2D[i][2] == user) ||
                    (array2D[0][i] == user && array2D[1][i] == user && array2D[2][i] == user)) {
                return true;
            }
        }
        return (array2D[0][0] == user && array2D[1][1] == user && array2D[2][2] == user) ||
                (array2D[0][2] == user && array2D[1][1] == user && array2D[2][0] == user);
    }







    public static boolean arrayF() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array2D[i][j] != 'X' && array2D[i][j] != 'O') {
                    return false;
                }
            }
        }
        return true;
    }






























}


