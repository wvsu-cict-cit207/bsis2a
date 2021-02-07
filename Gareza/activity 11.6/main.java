package garezaAct11;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        IS_student IS;
        personal_info INFO = new personal_info();
        grades GRADES = new grades();
        Scanner gg = new Scanner(System.in);
        int aa=0;
        String qq="";


        IS = INFO;
        System.out.println("ENTER INFORMATION ABOUT YOU A [BSIS STUDENT]");
        System.out.println("Enter [First Name]: ");
        qq = gg.next();
        INFO.setFirstname(qq);
        System.out.println("Enter [Last Name]: ");
        qq = gg.next();
        INFO.setLastname(qq);
        System.out.println("Enter [Age]: ");
        aa = gg.nextInt();
        INFO.setAge(aa);
        System.out.println("Enter [Gender]: ");
        qq = gg.next();
        INFO.setGender(qq);
        System.out.println("Enter [Address]: ");
        qq = gg.next();
        INFO.setAddress(qq);
        System.out.println("Enter [Mobile Number]: ");
        aa = gg.nextInt();
        INFO.setMobilenumber(aa);

        IS = GRADES;
        System.out.println("ENTER GRADES FOR THE [FIRST SEMESTER]");
        System.out.print("Enter grades in [Ethics]: ");
        aa = gg.nextInt();
        GRADES.setEthics(aa);
        System.out.print("Enter grades in [P.E.]: ");
        aa = gg.nextInt();
        GRADES.setPe(aa);
        System.out.print("Enter grades in [Accounting]: ");
        aa = gg.nextInt();
        GRADES.setAccounting(aa);
        System.out.print("Enter grades in [Art Appreciation]: ");
        aa = gg.nextInt();
        GRADES.setArtapre(aa);
        System.out.print("Enter grades in [Data Algorithm]: ");
        aa = gg.nextInt();
        GRADES.setDataalgo(aa);
        System.out.print("Enter grades in [OOP]: ");
        aa = gg.nextInt();
        GRADES.setOop(aa);
        System.out.print("Enter grades in [IT- Infrastructure]:");
        aa = gg.nextInt();
        GRADES.setInfra(aa);


        IS =INFO;
        System.out.print("\nFirst name: "+INFO.getFirstname());
        System.out.print("\nLast name: "+INFO.getLastname());
        System.out.print("\nAge: "+INFO.getAge());
        System.out.print("\nGender: "+INFO.getGender());
        System.out.print("\nAddress: "+INFO.getAddress());
        System.out.print("\nMobile Number: "+INFO.getMobilenumber());

        System.out.print("\n\nthese are "+INFO.getFirstname()+ INFO.getLastname()+" a BSIS student [grades] for the first semester.");
        IS=GRADES;
        System.out.print("\nGrade in [Ethics] = "+GRADES.getEthics());
        System.out.print("\nGrade in [P.E.] = "+GRADES.getPe());
        System.out.print("\nGrade in [Accounting] = "+GRADES.getAccounting());
        System.out.print("\nGrade in [Art Appreciation] = "+GRADES.getArtapre());
        System.out.print("\nGrade in [Data Algorithm ] = "+GRADES.getDataalgo());
        System.out.print("\nGrade in [OOP] = "+GRADES.getOop());
        System.out.print("\nGrade in [IT- Infrastructure] = "+GRADES.getInfra());
    }
}
