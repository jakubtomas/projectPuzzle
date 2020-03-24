package sample;

import java.util.ArrayList;
import java.util.Random;

public class Field {
// 16 objects

    private Tile array[][];

    private int[] arrayNumbers = new int[16];

    public Tile[][] getArray() {
        return array;
    }

    public void setArray(Tile[][] array) {
        this.array = array;
    }


    public Field() {
        //
        InitField();
    }

    private void InitField() {
        //  int[] arrayNumbers = new int[15];
        // int[] arrayNumbers  = new int[15];
        int arrCount = 0;


        Random rnd = new Random();

        //  put all code into the for what must generate 15 numbers


        // numbers.add(rndNumber);
        int matches = 0;
        int gNum = 15;

        for (int g = 0; g < gNum; g++) { // generate number

            int rndNumber = rnd.nextInt(15);
            //  System.out.println("generate  " + rndNumber);


            boolean permission = true;


            //System.out.println("G " + g);
            // check the number we have yes or no
            for (int i = 0; i < g; i++) {
                //  System.out.println("rnd " + rndNumber + " ====" + arrayNumbers[i]);

                if (rndNumber == arrayNumbers[i]) {

                    //    System.out.println("match values");
                    permission = false;
                    break;


                }

            }
            if (permission) {
                arrayNumbers[arrCount] = rndNumber;
                ++arrCount;
            } else {
                g--;
            }

            /*if (g == 14) {
                g = g - matches;
            }*/
        }
        System.out.println(" Length array " + arrayNumbers.length);
        for (int i = 0; i < arrayNumbers.length; i++) {

            System.out.println(" [" + i + "] " + arrayNumbers[i]);


            // checking that we used the  number

        }


        array = new Tile[4][4];
        int count = 3;

      /*  for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                array[i][j] = new Tile(arrayNumbers[count]);

               // array[i][j].setValue(4);

            }
        }*/

        array[0][0] = new Tile(arrayNumbers[0]);
        array[0][1] = new Tile(arrayNumbers[1]);
        array[0][2] = new Tile(arrayNumbers[2]);
        array[0][3] = new Tile(arrayNumbers[3]);


        array[1][0] = new Tile(arrayNumbers[4]);
        array[1][1] = new Tile(arrayNumbers[5]);
        array[1][2] = new Tile(arrayNumbers[6]);
        array[1][3] = new Tile(arrayNumbers[7]);

        array[2][0] = new Tile(arrayNumbers[8]);
        array[2][1] = new Tile(arrayNumbers[9]);
        array[2][2] = new Tile(arrayNumbers[10]);
        array[2][3] = new Tile(arrayNumbers[11]);

        array[3][0] = new Tile(arrayNumbers[12]);
        array[3][1] = new Tile(arrayNumbers[13]);
        array[3][2] = new Tile(arrayNumbers[14]);
        array[3][3] = new Tile(99);


    }

    public boolean isWinner() {




        /*int count = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (array[i][j].isValue()) {
                    count++;
                }
            }
        }

        // something you have to add  in this function
        if (count == 16 || count == 0) {
            System.out.println("You  won!");
            return true;
        }
*/
        return false;

    }

    public void toggleTiles(int number) {


        if (number < 4 && number > -1) {
            //minus 0
            System.out.println("first row ");
            System.out.println("array value " + array[number][0].getValue());
            //change values


        } else if (number < 8 && number > 3) {
            // minus 4
            System.out.println("array value " + array[number - 4][1].getValue());


 // / comment   asdf
            System.out.println("second row ");
        } else if (number < 12 && number > 7) {
            // minus 8
            System.out.println("third row ");
            System.out.println("array value " + array[number - 8][2].getValue());

        } else if (number < 17 && number > 11) {
            // minus 12
            System.out.println("forth  row ");
            System.out.println("actual value " + array[number - 12][3].getValue());




         //   System.out.println("value right  " + array[number - 12+1][3].getValue()) ;
            int coordinate = number - 12 + 1;

            if (coordinate < 4 && coordinate > -1) {

                if (array[number - 12 + 1][3].getValue() == 99) { // horizontal left

                    array[number - 12 + 1][3].setValue(array[number - 12][3].getValue()); // actual value
                    array[number - 12][3].setValue(99);
                }else if (array[number - 12-1][3].getValue() == 99) {

                    array[number - 12 - 1][3].setValue(array[number - 12][3].getValue()); // actual value
                    array[number - 12][3].setValue(99);
                }

            // comment

            } else {
                System.out.println("mimo rozsah ");
            }

             coordinate = number - 12 -1;


            if (coordinate < 3 && coordinate > -1) {

                if (array[number - 12 + 1][3].getValue() == 99) { // horizontal left

                    array[number - 12 + 1][3].setValue(array[number - 12][3].getValue()); // actual value
                    array[number - 12][3].setValue(99);
                }else if (array[number - 12-1][3].getValue() == 99) {

                    array[number - 12 - 1][3].setValue(array[number - 12][3].getValue()); // actual value
                    array[number - 12][3].setValue(99);
                }



            } else {
                System.out.println("mimo rozsah ");
            }


            /*
            else if (array[number - 12-1][3].getValue() == 99) {

                array[number - 12 - 1][3].setValue(array[number - 12][3].getValue()); // actual value
                array[number - 12][3].setValue(99);
            }
*/



            /*if ( array[number - 12-1][3].getValue() == 99) {

                array[number - 12-1]
                        [3].setValue(array[number - 12][3].getValue());
                array[number - 12][3].setValue(99);
            }*/




            /*if (array[number - 12][3 + 1].getValue() == 99) { // vertical down


                array[number - 12][3 + 1].setValue( array[number - 12][3].getValue());
                array[number - 12][3 ].setValue(99);



            } else if (array[number - 12][3 - 1].getValue() == 99) { // vertical up
                array[number - 12][3 + 1].setValue( array[number - 12][3].getValue());
                array[number - 12][3 ].setValue(99);

            } else if (array[number - 12 + 1][3].getValue() == 99) { // horizontal right
                array[number - 12][3 + 1].setValue( array[number - 12][3].getValue());
                array[number - 12][3 ].setValue(99);

            } else if (array[number - 12 - 1][3].getValue() == 99) { // horizontal left


            }*/


        }

        System.out.println("=====================");
        int xcol = number % 4;  // col stlpec
        int yrow = number / 4;  // row riadok


        for (int jrow = 0; jrow < array.length; jrow++) { // riadok
            for (int icol = 0; icol < array.length; icol++) {// stlpec
                if (!(xcol == icol && yrow == jrow) && Math.abs(xcol - icol) <= 1 && Math.abs(yrow - jrow) <= 1) {
                    //  array[icol][jrow].toggle(number);
                }
            }
        }
    }

    public void print() {
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                if (array[i][j].getValue() < 10) {
                    System.out.print(" " + array[i][j].getValue() + " ");

                } else {
                    System.out.print(array[i][j].getValue() + " ");
                }
            }
            System.out.println("  ");
        }
        System.out.println("  ");
    }

    public void shuffle() {// take the number


    }
    //return false;
}


