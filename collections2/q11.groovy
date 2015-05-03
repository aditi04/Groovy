class Employee
{
  String Name;
  int age;
  String dept;
  int e_no;
  int salary;
}
Employee e1=new Employee(name:'anu',age:25,dept:'Finance',e_no:101,salary:20000)
Employee e2=new Employee(name:'bunny',age:53,dept:'Marketing',e_no:102,salary:2000)
Employee e3=new Employee(name:'cia',age:63,dept:'Manufacturing',e_no:103,salary:3000)
Employee e4=new Employee(name:'dia',age:19,dept:'Marketing',e_no:104,salary:4000)
Employee e5=new Employee(name:'esha',age:54,dept:'Manufacturing',e_no:105,salary:6000)
List l=[e1,e2,e3,e4,e5]

Map m1=l.groupBy({
     if((it.salary>=0) && (it.salary<=5000))
     return "Within 5000";
     else if((it.salary>5000) && (it.salary<=10000)) 
     return "Within 10000";
     else
     return "above 10000"
})
println "a) "
m1.each{
print it.key
println it.value.name
}
println "b) "
Map m2=l.groupBy({it.dept})
m2.each({

  print "\t"+it.key+" "+it.value.size();
})
print "\n"
List m3=[]
l.each{
if(it.age>18 && it.age<35)
m3.add(it.name)
}
println "c)"+m3

println "d) "
Map m4=l.groupBy{it.name[0]};
println m4
m4.each{
print "Name Start with:${it.key} and number of Employees with Age >20 are:"
println it.value.countBy({it2->it2.age>20}).get(true)
}

Map m5=l.groupBy({it.dept})
println "e) "
m5.each{
print it.key
println it.value.name
}
