/**
In this little assignment you are given a string of space separated numbers, and have
to return the highest and lowest number.

Examples
Sol.high_and_low("1 2 3 4 5")  // return "5 1"
Sol.high_and_low("1 2 -3 4 5") // return "5 -3"
Sol.high_and_low("1 9 3 4 -5") // return "9 -5"
Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
 **/


def highAndLow(numbers: String): String = {
  val input = numbers.split(" ")
  val inputTransformed = input.map(_.toInt)
  val max = inputTransformed.max
  val min = inputTransformed.min

  s"$max $min"

}


val str1 = ("1 2 -3 4 5")
//val max = str1.split(" ").map(_.toInt).max.toString
//val min = str1.split(" ").map(_.toInt).min.toString

highAndLow(str1)