package common

object week2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet")



  type Set = Int => Boolean;$skip(152); 

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: common.week2.Set, elem: Int)Boolean""");$skip(112); 

  /**
   * Returns the set of the one given element.
   */
    def singletonSet(elem: Int): Set = x=> x== elem;System.out.println("""singletonSet: (elem: Int)common.week2.Set""");$skip(73); 
     def union(s: Set, t: Set): Set = x=> contains(s,x) || contains(t,x);System.out.println("""union: (s: common.week2.Set, t: common.week2.Set)common.week2.Set""");$skip(35); 
     
     val s = singletonSet(3);System.out.println("""s  : common.week2.Set = """ + $show(s ));$skip(26); 

     val setu = Set(3,4);System.out.println("""setu  : scala.collection.immutable.Set[Int] = """ + $show(setu ));$skip(23); val res$0 = 

     contains(setu,3);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(26); val res$1 = 
     

     contains(s,3);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(25); val res$2 = 
     
     contains(s,4);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(106); 


   // def union(s: Set, t: Set): Set = (e:Int)=> contains(s,e) || contains(t,e)

   val s1 = Set(1,2,3);System.out.println("""s1  : scala.collection.immutable.Set[Int] = """ + $show(s1 ));$skip(21); 
   val s2 = Set(2,4);System.out.println("""s2  : scala.collection.immutable.Set[Int] = """ + $show(s2 ));$skip(22); 

val u = union(s1,s2);System.out.println("""u  : common.week2.Set = """ + $show(u ));$skip(18); val res$3 = 

   contains(u,5);System.out.println("""res3: Boolean = """ + $show(res$3))}
	// contains(u,5)
}
