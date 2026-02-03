import java.util.Scanner;
public class SecurityGate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //String passengerName="Amelia Barner";
        System.out.println("enter name");
        String passengerName=sc.next();
        System.out.println("enter age");
        //int passengerAge=25;
        int passengerAge=sc.nextInt();
        System.out.println("enter baggage weight :");
        double passengerBaggageWeight=sc.nextDouble();
        //double passengerBaggageWeight=18.5;
        System.out.println("enter true or false");
        boolean passengerHasBoardingPass=sc.nextBoolean();
        System.out.println("enter gender: ");
        char gender=sc.next().charAt(0);
        //char gender ='F';

        System.out.println("Processing Passenge: "+ passengerName);
        System.out.println("checking baggage weight" + passengerBaggageWeight+ "kg");
        System.out.println("passenger: " + passengerName +" is allowed to board to the plane: " + passengerHasBoardingPass);



    }
}
