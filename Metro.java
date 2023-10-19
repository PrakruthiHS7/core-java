class Metro{
int metroId;
int noOfCompartment;
String source;
String destination;
 public Metro(int metroId,int noOfCompartment, String source, String destination)
 {
 this.metroId=metroId;
 this.noOfCompartment=noOfCompartment;
 this.source=source;
 this.destination=destination;
 }
 public  void displayDetails()
 {
 System.out.println("the metro id is "+metroId);
 System.out.println("the noOfCompartment is "+noOfCompartment);
 System.out.println("the source id is "+source);
 System.out.println("the destination id is "+destination);
 }
}