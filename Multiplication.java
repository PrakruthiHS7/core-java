class Multiplication
{
public static void main(String Multiplication[])
{
   mul(25,25,25);
   mul(15,15,15);
   mul(30,30,1);
   mul(50,50);
   mul(29,29);
   mul(50,2,2);
    mul(20,20);
   mul(19,19);
   mul(18,18);
    mul(17,17);
   mul(16,16);
   mul(15,15);
    mul(14,14);
   mul(13,13);
   mul(11,11);
    mul(12,12);
   mul(9,9,2);
   mul(7,8);
    mul(6,4);
   mul(4,5,1);
   mul(3,5,2);
   }
   public static void mul(int num1, int num2)
   {
   int multiplication = num1 * num2;
   System.out.println(multiplication);
   }
   public static void mul(int num1, int num2,int num3)
   {
   int multiplication2 = num1 * num2*num3;
   System.out.println( multiplication2);
   }
 }