
import java.util.Scanner;

import javax.swing.JOptionPane;

public class calculator {

static int Ctype;

 static Scanner sc ;
static int np;

public static void main (String []args){

sc = new Scanner (System.in);
int count = 0;

type();

System.out.println();



JOptionPane.showMessageDialog(null,"Hi Welcome Choose The Type Of The Calculator ");

if(np==0){

while(true){



System.out.println();

System.out.println(" Enter The Number For Type of the Calculator That You want:  ");

  Ctype = sc .nextInt();


while(Ctype > 7  || Ctype==0 ){

while (true ){
        System.out.println("Please Enter A Number From 1-7");
         Ctype = sc .nextInt();

         if(Ctype <=7){
             break;
         }
        }



    }





switch(Ctype){
    case 1 :
    add();
    break;
    case 2:
    sub();
    break;
    case 3 :
    multi();
    break;
    case 4 :
    divi();
    break;
    case 5 :
    ABS();
    break;
    case 6 :
    SQRT();
    break;
    case 7 :
    POW();
    break;

}

count ++;
if(count ==3 ){
  
    System.out.println();
    JOptionPane.showMessageDialog(null,"You Have Been Quite To The Program You Can Just Change The Type For 3 Type");
    break;
}

}

}




    }








static void add (){
JOptionPane.showMessageDialog(null,"Welcome to Addition Calculator");


while(true){
    System.out.println();

System.out.println("Number 1");

double  Add1= sc.nextDouble();

System.out.println("Number 2");

double Add2 = sc.nextDouble();

double sum = Add1+ Add2;

System.out.println();

System.out.println("The Result is " + sum);
System.out.println();

 np =Integer.parseInt( JOptionPane.showInputDialog(null,"TO Try It Again Enter 1 to Close Enter 0"));




if(np ==1 ){

    continue;
}
if(np == 0){
    break;
}


}




}




static void sub(){



    JOptionPane.showMessageDialog(null,"Welcome to Subtraction Calculator");


    while(true){
    System.out.println();

    System.out.println("Number 1");

    double  sub1= sc.nextDouble();

    System.out.println("Number 2");

    double sub2 = sc.nextDouble();

    double sub = sub1 - sub2;

    System.out.println();

    System.out.println("The Result is " + sub);
    System.out.println();

     np =Integer.parseInt( JOptionPane.showInputDialog(null,"TO Try It Again Enter 1 to Close Enter 0"));
    if(np ==1 ){

        continue;
    }
    if(np == 0){
        break;
    }

    }



}




static void multi (){


    JOptionPane.showMessageDialog(null,"Welcome to Multiplication Calculator");


    while(true){
    System.out.println();

    System.out.println("Number 1");

    double  multi1= sc.nextDouble();

    System.out.println("Number 2");

    double multi2 = sc.nextDouble();

    double multi = multi1 * multi2;

    System.out.println();

    System.out.println("The Result is " + multi);
    System.out.println();

     np =Integer.parseInt( JOptionPane.showInputDialog(null,"TO Try It Again Enter 1 to Close Enter 0"));
    if(np ==1 ){

        continue;
    }
    if(np == 0){
        break;
    }


    }

}




public static void divi(){

    JOptionPane.showMessageDialog(null,"Welcome to Division Calculator");


    while(true){
    System.out.println();

    System.out.println("Number 1");

    double  div1= sc.nextDouble();

    System.out.println("Number 2");

    double div2 = sc.nextDouble();

    double div = div1 / div2;

    System.out.println();

    System.out.println("The Result is " + div);
    System.out.println();

     np =Integer.parseInt( JOptionPane.showInputDialog(null,"TO Try It Again Enter 1 to Close Enter 0"));
    if(np ==1 ){

        continue;
    }
    if(np == 0){
        break;
    }


    }



}


static void ABS(){

    JOptionPane.showMessageDialog(null,"Welcome to Absolute value Calculator");

while (true){
    System.out.println();
    System.out.println("Number 1");

    double  abs1= sc.nextDouble();

double abs2 = Math.abs(abs1);

System.out.println();
System.out.println("The Result is " + abs2);

 np =Integer.parseInt( JOptionPane.showInputDialog(null,"TO Try It Again Enter 1 to Close Enter 0"));
if(np ==1 ){

    continue;
}
if(np == 0){
    break;
}

}
}



static void SQRT(){

    JOptionPane.showMessageDialog(null,"Welcome to Square Root Calculator");

while (true){
    System.out.println();
    System.out.println("Number 1");

    double  sqr1= sc.nextDouble();


while(sqr1<0){


if(true){
	System.out.println();
	    System.out.println("Number 1");

	sqr1= sc.nextDouble();
if(sqr1>0){
	break;
}

}


}


double sqr2 = Math.sqrt(sqr1);

System.out.println();
System.out.println("The Result is " + sqr2);

 np =Integer.parseInt( JOptionPane.showInputDialog(null,"TO Try It Again Enter 1 to Close Enter 0"));
if(np ==1 ){

    continue;
}
if(np == 0){
    break;
}

}

}






static void POW(){


    JOptionPane.showMessageDialog(null,"Welcome to Power Calculator");

    while (true){
        System.out.println();
        System.out.println("Base Number");

        double  pow1= sc.nextDouble();

System.out.println("The Number That You Want to Power");

double pow2 = sc.nextDouble();

System.out.println();



    double pow3 = Math.pow(pow1, pow2);

    System.out.println();
    System.out.println("The Result is " + pow3);


     np =Integer.parseInt( JOptionPane.showInputDialog(null,"TO Try It Again Enter 1 to Close Enter 0"));
    if(np ==1 ){

        continue;
    }
    if(np == 0){
        break;
    }

    }





}






static void  type (){

       for(int x= 1 ; x<=10; x++){
            char equal = '#';
            System.out.printf("%7c#####",equal);
            }


            String item ="CALCULATOR Type";
             System.out.printf("%40S",item);

            System.out.println();

            System.out.println("\t\t\t\t\t\t\t\t1:  Addition ");
            System.out.println("\t\t\t\t\t\t\t\t2: Subtraction ");
            System.out.println("\t\t\t\t\t\t\t\t3: Multiplication");

            System.out.println("\t\t\t\t\t\t\t\t4: Division");
            System.out.println("\t\t\t\t\t\t\t\t5: Absolute value ");


            System.out.println("\t\t\t\t\t\t\t\t6: Square root ");
            System.out.println("\t\t\t\t\t\t\t\t7: Power ");


            for(int x= 1 ; x<=10; x++){
                char equal = '#';
                System.out.printf("%7c#####",equal);
                }


}








    }
