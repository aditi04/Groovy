class Person
{
String name
int age
String city
String company
int id
int salary
String gender 

public String toString()
{
return name+" is a "+gender+" aged "+age+" who lives at "+city+".He works for "+company+" with employee id "+id+" and draws "+salary+" lots of money!"
}

public static void main(String...a)
{
def ob=new Person()
ob.name="Sachin"
ob.age=24
ob.city="Delhi"
ob.company="Intelligrape"
ob.id=12
ob.gender="man"
ob.salary=25000
print(ob.toString())
}
}