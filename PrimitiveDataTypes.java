import java.util.Scanner;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        int num1;
        byte num2;
        short num3;
        long num4;
        float num5;
        double num6;
        char num7;
        boolean num8;
        int i = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Integer Datatype Number : ");
        num1  = sc.nextInt();

        System.out.print("Enter Byte Datatype Number : ");
        num2  = sc.nextByte();

        System.out.print("Enter Short Datatype Number : ");
        num3  = sc.nextShort();

        System.out.print("Enter Long Datatype Number : ");
        num4  = sc.nextLong();

        System.out.print("Enter Float Datatype Number : ");
        num5  = sc.nextFloat();

        System.out.print("Enter Double Datatype Number : ");
        num6  = sc.nextDouble();

        System.out.print("Enter Char Datatype Number : ");
        num7  = sc.next().charAt(0);

        System.out.print("Enter Boolean Datatype Number : ");
        num8  = sc.nextBoolean();

        while (i++ < 2) {
            System.out.print("============================================\n");
            System.out.println("Addition : "+num4+" + "+num2+" = "+ (num4+num2));
            System.out.println("Subtraction : "+num3+" - "+num2+" = "+ (num3-num2));
            System.out.println("Multiplication : "+num6+" * "+num5+" = "+ (num6*num5));
            System.out.println("Modulo Operation : "+num2+" % "+num1+" = "+ (num2%num1));
            System.out.println("Division : "+num2+" / "+num1+" = "+ (num2/num1));
        }
    }
}

