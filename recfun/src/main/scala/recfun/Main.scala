package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {

    def factorial(n: Int): Int = {
      (1 to n).product
    }


    /**
      * Exercise 1
      */
    def pascal(c: Int, r: Int): Int = {
      if (c == r) 1
      else {
        factorial(r) / factorial(c) / factorial(r - c)
      }

    }
    pascal(c,r)
  }


    /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
    //   val filtered =chars.filterNot(_.isLetterOrDigit)
    //    println(filtered)

    val filteredList =for{
      c <- chars
      if(c=='(' || c==(')'))

    } yield c

    def isPair(list: List[Char]): Boolean={
      list.head=='(' && list.endsWith(List(')'))
    }
    isPair(filteredList)

  }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int =
  money match{
    case 0 => 1
    case _ => 0

      def countChangeRec()


  }
  }

