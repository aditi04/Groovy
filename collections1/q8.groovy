class Employee
{
  String name;
  int age;
  int salary;
}
Employee e1=new Employee(name:'anu',age:23,salary:20000)
Employee e2=new Employee(name:'bunny',age:53,salary:3000)
Employee e3=new Employee(name:'cia',age:83,salary:3000)
Employee e4=new Employee(name:'dia',age:13,salary:4000)
Employee e5=new Employee(name:'esha',age:58,salary:6000)
Employee e6=new Employee(name:'farva',age:76,salary:10000)
Employee e7=new Employee(name:'golu',age:17,salary:3800)
Employee e8=new Employee(name:'harsh',age:89,salary:3700)
Employee e9=new Employee(name:'joe',age:10,salary:4090)
Employee e10=new Employee(name:'kanu',age:54,salary:8000)

List l=[e1,e2,e3,e4,e5,e6,e7,e8,e9,e10]
println "PART1"
List l2=l.findAll{Employee e->          
   e.salary<5000
}
l2.each    
{
   println it.name+" "+it.age+" "+it.salary
}
println "PART2" 
println "YONGEST employee= "+l.min({it.age}).name
println "OLDEST employee= "+l.max({it.age}).name
println "PART3"
println "EMPLOYEE WITH HIGHEST SALARY= "+l.max({it.salary}).name
println "PART4"
/*List l1=l.findAll
{
  it.name
}*/
print l*.name