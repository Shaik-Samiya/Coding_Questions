public class Main
 {
   public static void main (String[]args)
   {
     int number = 29;
       System.out.println ( number % 2 == 0 ? " Even" : " Odd");
   }
 }

//another 

if (number % 2 == 0)
              System.out.println(number + " is Even");
     else
              System.out.println(number + " is odd");
      }

//using bitwise AND
public static void main (String[]args)
  {
    int number = 29;

    if (isEven (number))
        System.out.println ("Even");
    else
        System.out.println ("Odd");
  }


// Returns true if n is even, else odd
  static bool isEven (int number)
  {

    // n & 1 is 1, then odd, else even
    return (!(number & 1));
  }

