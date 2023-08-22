class Vegetables
{
 static  String  vegetables[]={"Beans","Carrot","Radish","Potatos","Tomato","Onion","cabbage","pumpkin","cucumber","Beetroot","Spinach","Pvoid eas","Okra","brinjal","Okra"};
public static void main(String vegetables[])
{
 getVegtables();
 getReversevegetables();
 }
 public static void getVegtables()
 {
 System.out.println("The list of Vegetables are:");
 for(int num=0;num<vegetables.length;num++)
 {
 System.out.println(vegetables[num]);
 }
 }
 public static void getReversevegetables()
 {
 System.out.println("The list of vegetables in reverse order:");
 for(int num=vegetables.length-1;num>=0;num--)
{
 System.out.println(vegetables[num]);
 }
 }
 }