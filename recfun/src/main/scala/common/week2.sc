package common

object week2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet



  type Set = Int => Boolean

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem)
                                                  //> contains: (s: common.week2.Set, elem: Int)Boolean

  /**
   * Returns the set of the one given element.
   */
    def singletonSet(elem: Int): Set = x=> x== elem
                                                  //> singletonSet: (elem: Int)common.week2.Set
     def union(s: Set, t: Set): Set = x=> contains(s,x) || contains(t,x)
                                                  //> union: (s: common.week2.Set, t: common.week2.Set)common.week2.Set
     
     val s = singletonSet(3)                      //> s  : common.week2.Set = <function1>

     val setu = Set(3,4)                          //> setu  : scala.collection.immutable.Set[Int] = Set(3, 4)

     contains(setu,3)                             //> res0: Boolean = true
     

     contains(s,3)                                //> res1: Boolean = true
     
     contains(s,4)                                //> res2: Boolean = false


   // def union(s: Set, t: Set): Set = (e:Int)=> contains(s,e) || contains(t,e)

   val s1 = Set(1,2,3)                            //> s1  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
   val s2 = Set(2,4)                              //> s2  : scala.collection.immutable.Set[Int] = Set(2, 4)

val u = union(s1,s2)                              //> u  : common.week2.Set = <function1>

   contains(u,5)                                  //> res3: Boolean = false
	// contains(u,5)
}