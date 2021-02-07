
package addresspart2;
import java.util.Scanner;
class AddressBook

{

  

  private  String Name;
  private  String Address;
  private  String Mobile_Number;
  private  String Email_Address;

     
     AddressBook()
     {

     }
     AddressBook(String n,String a,String m,String e)
     {
        Name = n;
        Address = a;
        Mobile_Number = m;
        Email_Address = e;
     }

     
     String get_Name()
     {
        return Name;  
     }
     String get_Address()
     {
        return Address;  
     }
     String get_Mobile_Number()
     {
        return Mobile_Number;
     }
     String get_Email_Address()
     {
        return Email_Address;
     }

     
     void set_Name(String n)
     {
        Name=n;  
     }
     void set_Address(String a)
     {
        Address=a;  
     }
     void set_Mobile_Number(String m)
     {
        Mobile_Number=m;
     }
     void set_Email_Address(String e)
     {
        Email_Address=e;
     }
};

public class Addresspart2 {

    
    public static void main(String[] args) {
     
        AddressBook book[] = new AddressBook[100];


for(int i=0;i<100;i++)book[i]=new AddressBook();


int size=0,n=0;

int c=0;

Scanner sc = new Scanner(System.in);

String s="";

while(true)

{


System.out.print("\n\nMain Menu\n 1:Add Entry \n 2:Delete Entry \n 3:View All Entries \n 4:Update an Entry \n 5:Exit \nChoose one option:");


c =sc.nextInt();


if(c==1)

{



System.out.print("Enter Name of the person in the address book :");


s =sc.next();

book[n].set_Name(s);


System.out.print("Enter Address of the person:");

s =sc.next();

book[n].set_Address(s);


System.out.print("Enter Mobile number of the person:");

s =sc.next();

book[n].set_Mobile_Number(s);


System.out.print("Enter Email address of the person:");

s =sc.next();

book[n].set_Email_Address(s);


size++;

n++;


}

else if(c==2 && size !=0)

{

int m;

s="";

System.out.print("Enter index to delete :");

m = sc.nextInt();

book[n].set_Name(s);

book[n].set_Address(s);

book[n].set_Mobile_Number(s);

book[n].set_Email_Address(s);

size--;

}

else if(c==3&& size !=0)

{

int i;

System.out.println("\nEntries in book:");

for(i=0;i<n;i++)

{

System.out.println(i);

System.out.println("Name:"+book[i].get_Name());

System.out.println("Address:"+book[i].get_Address());

System.out.println("Mobile Number:"+book[i].get_Mobile_Number());

System.out.println("Email Address:"+book[i].get_Email_Address());

System.out.println("\n-------------------------");

}


}

else if(c==4&& size !=0)

{

int m;

s="";

System.out.print("Enter index to update :");

m = sc.nextInt();

System.out.print("Enter Name of the person in the address book :");

s =sc.next();

book[m].set_Name(s);


System.out.print("Enter Address of the person:");

s =sc.next();

book[m].set_Address(s);


System.out.print("Enter Mobile number of the person:");

s =sc.next();

book[m].set_Mobile_Number(s);


System.out.print("Enter Email address of the person:");

s =sc.next();

book[m].set_Email_Address(s);



}

else if(c==5)

{

System.out.println("\n\nThank you.......");

break;

}

else

{

System.out.println("\n Enter Correct Choice\n");

}


}
    }
    
}
