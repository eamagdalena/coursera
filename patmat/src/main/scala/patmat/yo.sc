val l = List('a','b','c','a')
l.groupBy(_.toChar).toList.map( e => (e._1, e._2.size))
