import java.util.Scanner;
public class Act10_AddressBook {
    public static void main(String args[])
    {

        AddressBookEntry book[] = new AddressBookEntry[100];//Instantiating an array of AddressBookEntry objects of 100 entries

        for(int i=0;i<100;i++)book[i]=new AddressBookEntry();

        int size=0,n=0;
        int c=0;
        Scanner sc = new Scanner(System.in);
        String s=" ";
        while(true)
        {

            System.out.print("\n\nMAIN \n 1:Add Entry \n 2:Delete Entry \n 3:View All Entries \n 4:Update an Entry \n 5:Exit \nChoose one option:");

            c =sc.nextInt();//reading choice

            if(c==1)
            {
//adding entry
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
            else if(c==2 && size !=0)//checking entry added or not
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

                break;
            }
            else
            {
                System.out.println("\nPlease Enter Correct Choice\n");
            }

        }

    }
}
