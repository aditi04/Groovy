Map<String,Map> m=['Computing':['Computing':600,'InformationSystems':300],
'Engineering':['Civil':200,'Mechanical':100],
'Management':['Management':800]
]
List l=m.keySet() as List
println "a)Number of University Departments= "+ l.size()

Map x=m."Computing"
println "b)Number of Programs delivered by Computing Department:"+x.size()

println "c)Students enrolled in Civil Engineering Program= "+ m.'Engineering'.'Civil'