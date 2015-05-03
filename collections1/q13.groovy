String x="aditi bhatnagar"
def c='a'
def ctr=0;
x.each{
    if(it==c)
    ctr++
}
println "number of Occurences of ${c}=${ctr}"
