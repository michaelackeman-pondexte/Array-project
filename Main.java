import java.util.Scanner;
class Main {
  public static void main(String[] args) {

int[ ] seats = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
String [] names = {"","","","","","","","","","","","","","",""};

Scanner scan = new Scanner(System.in);
for(int i = 0; i< names.length; i++){
System.out.println(" What is your name?");

names[i] = scan.next(); 


int i = 0;
}
while (i < 15){
 
System.out.println( names[0] + " sits in seat #" + seats[0]);
i++;

}

  }
}