dirName ="groovy ex"
def nfile=new File("new.txt")
new File(dirName).eachFile()
{
   file-> file.eachLine{line->nfile<<line<<"\n";}
}