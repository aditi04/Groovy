def nfile=new File('new1.txt')
def file=new File('new.txt')
int var=0;
file.eachLine{line->
   var++
   if(var%2!=0)
   nfile<<var<<" "<<line<<"\n";
}
