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

        def rec(balance: Int, chars: List[Char]): Boolean = (balance, chars) match {
          case (-1, _) => false
          case (0, Nil) => true
          case (_) => chars.head match {
            case '(' => rec(balance+1, chars.tail)
            case ')' => rec(balance-1, chars.tail)
            case _ => rec(balance, chars.tail)
          }
        }
        rec(0, chars)
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

