class Act11_StudentRec {

    private String name;
     private String address;
     private int age;
     private int subjects;
     private int mobi;
     private double GWA;
    Act11_StudentRec(){

    }
    Act11_StudentRec(String na, String ad, int ag, int sub, int mob, double GW){

        name = na;
        address = ad;
        age = ag;
        subjects = sub;
        mobi = mob;
        GWA = GW;
    }

    String get_Name() {
        return name;
    }
    String get_Address() {
        return address;
    }
    int get_Age() {
        return age;
    }
    int get_Subjects() {
        return subjects;
    }
    int get_Mobi() {
        return mobi;
    }
    double get_GWA() {
        return GWA;
    }

    void set_name(String na) {name =na;}
    void set_address(String ad){address = ad;}
    void set_age(int ag){age = ag;}
    void set_subjects(int sub){subjects = sub;}
    void set_mobi(int mob){mobi = mob;}
    void set_GWA(double GW){GWA = GW;}




}
