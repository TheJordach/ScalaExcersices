/*
You are given an array (which will have a length of at least 3, but could be very large) containing integers.
The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
Write a method that takes the array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)
 */

def findOutlier(integers: List[Int]): Int = {
  /**Algorithm
  1.Create one list 'evenList' containing even number ONLY
  2.Create one list 'oodList' containing odd number ONLY
  3. If the the size of 'evenLit' is greater than 1 => we are dealing with even Array
     -> Then find and return the only odd int
  4. If the the size of 'evenLit' is greater than 1 => we are dealing with even Array
     -> Then find and return the only odd int
  5. in other case returns 0
  **/

  lazy val isEven: Int => Boolean = _ %2 == 0
  lazy val isOdd : Int => Boolean = _ % 2 != 0

  val evenList = integers.filter(isEven)
  val oodList = integers.filter(isOdd)

  if (evenList.length > 1) {
      integers.filter(isOdd).head
  }
  else if (oodList.length > 1) {
    integers.filter(isEven).head

  }
  else 0
}


//OPTION 2

def findOutlier(integers: List[Int]): Int = {
  val (evenList, oddList) = integers.partition(_ % 2 == 0)

  if (evenList.length > 1) {
    oddList.head
  } else if (oddList.length > 1) {
    evenList.head
  } else {
    0
  }
}


//OPTION 3 -- NOT MINE
def findOutlier(integers: List[Int]): Int =
  integers.partition(_%2 == 0) match {
    case (List(outlier), _) => outlier
    case (_, List(outlier)) => outlier
  }



val eveninput = List(2, 4, 0, 100, 4, 11, 2602, 36)
findOutlier(integers = eveninput)

val oodinput = List(160, 3, 1719, 19, 11, 13, -21)
findOutlier(integers = oodinput)









