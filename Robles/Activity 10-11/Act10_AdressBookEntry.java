class AddressBookEntry
{
    //attributes
    private   String Name;//Name of the person in the address book
    private   String Address;//Address of the person
    private   String MobiNum;//Mobile number of the person
    private   String EmailAdd;//Email address of the person

    //constructors
    AddressBookEntry()
    {

    }
    AddressBookEntry(String n,String a,String m,String e)
    {
        Name = n;
        Address = a;
        MobiNum = m;
        EmailAdd = e;
    }

    //Accessors
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
        return MobiNum;
    }
    String get_Email_Address()
    {
        return EmailAdd;
    }

    //mutators
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
        MobiNum=m;
    }
    void set_Email_Address(String e)
    {
        EmailAdd=e;
    }
}