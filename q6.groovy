List l=(1..10)
print l;
print "\n"
def map = [:]

l.each {
    if (it % 2 == 0)
        map.putAt(it, "even")
    else
        map.putAt(it, "odd")
}

println map