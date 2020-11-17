import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    int[] seats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    String[] names = new String[15];//my int and string arrays

    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < names.length; i++) {//for loop 
      System.out.println(" What is your name?");

      names [i] = scan.next();

    
    }
    int i = 0;// Initilization( intilizes variable i )

    while (i < 15) {// test( tests the variable)

      System.out.println(names[i] + " sits in seat #" + seats[i]);
      i++;// update( updates variable i to keep it from running infintely )
  
    }

  }
}