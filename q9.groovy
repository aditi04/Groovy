def file=new File('new.txt')
def nfile=new File('new2.txt')
def x
file.eachLine{line->
   x=line.replaceAll("\\s+","")
   nfile<<x;
}
