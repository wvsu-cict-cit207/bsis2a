
package address;
import java.util.Scanner;
public class Address {

    
String name[]=new String[2];

String address[]=new String[2];

String mob[]=new String[2];

String email[]=new String[2];

static int i;

void input() 

{

Scanner sc=new Scanner(System.in);


System.out.println("Enter the Name");

name[i]=sc.nextLine();

System.out.println("Enter the address");

address[i]=sc.nextLine();

System.out.println("Enter the Mobile Number");

mob[i]=sc.nextLine();

System.out.println("Enter the email");


email[i]=sc.nextLine();

i=i+1;

}

void delete(String n)

{

int k,j,p;

for(j=0;j<2;j++)

{



if(n.equalsIgnoreCase(name[j]))

{

k=j; 

for(p=k;p<2;p++)

{ 

name[p]=name[p+1];

address[p]=address[p+1];

mob[p]=mob[p+1];

email[p]=email[p+1];

}

}

}

}

void display()

{

int e;

for(e=0;e<2;e++) 

{

System.out.println("Name : "+name[e]);

System.out.println("Address : "+address[e]);

System.out.println("Mobile : "+mob[e]);

System.out.println("Email : "+email[e]);

System.out.println();

}

}

void update(String t) 

{

Scanner sc=new Scanner(System.in);

int k=-1,j;

for(j=0;j<2;j++)

{

if(t.equalsIgnoreCase(name[j])) 

{

k=j;

//taking entry from the user

System.out.println("Enter the Details Edit");

System.out.println("Enter the Name");

name[k]=sc.nextLine();

System.out.println("Enter the Address");

address[k]=sc.nextLine();

System.out.println("Enter the Mobile Number");

mob[k]=sc.nextLine();

System.out.println("Enter the Email");

email[k]=sc.nextLine();

}

}

if(k==-1) 

{

System.out.println("Record Not Found");

}  

}
    public static void main(String[] args) {
        int lam; 

Scanner sc=new Scanner(System.in);

Address obj=new Address(); 

do

{ 

System.out.println("1.Add Entry");

System.out.println("2.Delete Entry");

System.out.println("3.View All Entries");

System.out.println("4.Update An Entry");

System.out.println("5.Exit");

System.out.println("Enter your choice");

lam = sc.nextInt();

switch(lam)

{

case 1:

obj.input(); 

break;

case 2:

if(i>0)

{

String nm;

System.out.println("Enter the name to delete");

nm=sc.next();

obj.delete(nm); 

break;

}

else

{

System.out.println("Please Enter Some data First");

break;

}

case 3:

obj.display(); 

break;

case 4:

if(i>0)

{

String newn;

System.out.println("Enter the name to Update");

newn=sc.next();

obj.update(newn);

break;

}

else

{

System.out.println("Please Enter Some data First");

break;

}



case 5:

System.exit(0);

default:

System.out.println("Invalid Choice");

}

}while(lam!=5);
    
    }
    
}
