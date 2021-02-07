import java.util.Scanner;

public class Act11_ExtStudentRecord {

    public static void main(String[] args) {

        Act11_StudentRec rec[] = new Act11_StudentRec[30];

        for (int i = 0; i < 30; i++)rec[i] = new Act11_StudentRec();
        Scanner sc = new Scanner(System.in);
        int nm = 0;
        int size = 0, z = 0;
        int c = 0;
        String s = " ";
        double g = 0.0;

        while (true) {
            System.out.print("\n\nMAIN \n 1:Add Entry \n 2:Delete Entry \n 3:View All Entries \n 4:Update an Entry \n 5:Exit \nChoose one option:");
            c = sc.nextInt();

            if(c==1) {
                System.out.print("Enter Name of the person in the record book :");
                s = sc.next();
                rec[z].set_name(s);

                System.out.print("Enter Address of the person in the record book :");
                s = sc.next();
                rec[z].set_address(s);

                System.out.print("Enter Age of the person in the record book :");
                nm = Integer.parseInt(sc.next());
                rec[z].set_age(nm);

                System.out.print("Enter Mobile Number of the person in the record book :");
                nm = Integer.parseInt(sc.next());
                rec[z].set_mobi(nm);

                System.out.print("Enter Number of Subjects of the person in the record book :");
                nm = Integer.parseInt(sc.next());
                rec[z].set_subjects(nm);

                System.out.print("Enter GWA (General Weighted Average) of the person in the record book :");
                g = Double.parseDouble(sc.next());
                rec[z].set_GWA(g);

                size++;
                z++;
            }

            else if(c==2 && size !=0){
                int m = 0;
                s = "";
                System.out.println("Enter index to delete : ");
                m = sc.nextInt();
                rec[z].set_name(s);
                rec[z].set_address(s);
                rec[z].set_age(nm);
                rec[z].set_mobi(nm);
                rec[z].set_subjects(nm);
                rec[z].set_GWA(g);
                System.out.println("Index deleted");
                size--;
                z--;

            }

            else if(c==3&& size !=0){
                int i;
                System.out.println("\nEntries in the record book:  ");
                for ( i = 0; i < z; i++) {
                    System.out.println("Entry No. " + i);
                    System.out.println("Name: " + rec[i].get_Name());
                    System.out.println("Address: " + rec[i].get_Address());
                    System.out.println("Age: " + rec[i].get_Age());
                    System.out.println("Mobile Number: " + rec[i].get_Mobi());
                    System.out.println("No. of Subjects: " + rec[i].get_Subjects());
                    System.out.println("GWA: " + rec[i].get_GWA()+"\n");

                }

            }

            else if(c==4&& size !=0){
                int m;
                System.out.println("Enter index to update: ");
                m =sc.nextInt();
                System.out.println("Enter Name of the person to update in the record book");
                s = sc.next();
                rec[z].set_name(s);

                System.out.println("Enter Address of the person to update in the record book");
                s = sc.next();
                rec[z].set_address(s);

                System.out.println("Enter Age of the person to update in the record book");
                nm = Integer.parseInt(sc.next());
                rec[z].set_age(nm);

                System.out.println("Enter Mobile Number of the person to update in the record book");
                nm = Integer.parseInt(sc.next());
                rec[z].set_mobi(nm);

                System.out.println("Enter Number of Subjects of the person to update in the record book");
                nm = Integer.parseInt(sc.next());
                rec[z].set_subjects(nm);

                System.out.println("Enter GWA of the person to update in the record book");
                g = Double.parseDouble(sc.next());
                rec[z].set_GWA(g);

            }
            else if(c==5){
                break;
            }
            else {
                System.out.println("Incorrect option, please enter again");
            }
        }


    }


}