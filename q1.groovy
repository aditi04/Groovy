class Person
{
private String name
private int age
private String gender 
private String address


public String getname()
   {
    return name;
   }
public int getage()
   {
    return age;
   }
public String getgender()
   {
    return gender;
   }
public String getaddress()
   {
    return address;
   }
public static void main(String...a)
   {
      def obj=new Person();
      obj.name="aditi";
      obj.age=22;
      obj.gender="female";
      obj.address="Delhi";
      println("NAME: "+obj.getname());
      println("AGE: "+obj.getage());
      println("GENDER: "+obj.getgender());
      println("ADDRESS: "+obj.address);
   }
}      
   