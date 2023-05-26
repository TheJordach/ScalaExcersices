/** pseudoCode
 * def bublesort(array)
 * n = length(array)
 * for (k=1 to n-1)
 *  for (j=0 until n-1)
 *   if (array[j] > array[j+1]
 *     swap(array, j,j+1)
 */

 def bubleSort(nums:Array[Int]) = {
   val n = nums.length
   for (k <- 1 until n; j <- 0 until n-1; if nums(j) > nums(j+1) ) {
      val x = nums(j)
      nums(j) = nums(j+1)
      nums(j+1) = x
   }
  nums
 }

val inputarray = Array(3,8,2,1,6,7,10)
bubleSort(inputarray)