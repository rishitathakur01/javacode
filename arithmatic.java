public class arithmatic{
   public arithmatic() {
   }

   public static void main(String[] var0) {
      byte var1 = 10;
      byte var2 = 5;
      System.out.println("----- Arithmetic Operators -----");
      System.out.println("Addition: " + (var1 + var2));
      System.out.println("Subtraction: " + (var1 - var2)); 
      System.out.println("Multiplication: " + var1 * var2);
      System.out.println("Division: " + var1 / var2);
      System.out.println("Modulus: " + var1 % var2);
      System.out.println("\n----- Assignment Operators -----");
      int var3 = 10;
      var3 += 5;
      System.out.println("x += 5: " + var3);
      var3 -= 3;
      System.out.println("x -= 3: " + var3);
      var3 *= 2;
      System.out.println("x *= 2: " + var3);
      var3 /= 4;
      System.out.println("x /= 4: " + var3);
      System.out.println("\n----- Comparison Operators -----");
      System.out.println("a == b: " + (var1 == var2));
      System.out.println("a != b: " + (var1 != var2));
      System.out.println("a > b: " + (var1 > var2));
      System.out.println("a < b: " + (var1 < var2));
      System.out.println("a >= b: " + (var1 >= var2));
      System.out.println("a <= b: " + (var1 <= var2));
      System.out.println("\n----- Logical Operators -----");
      boolean var4 = true;
      boolean var5 = false;
      System.out.println("p && q: " + (var4 && var5));
      System.out.println("p || q: " + (var4 || var5));
      System.out.println("!p: " + !var4);
      System.out.println("\n----- Bitwise Operators -----");
      System.out.println("a & b: " + (var1 & var2));
      System.out.println("a | b: " + (var1 | var2));
      System.out.println("a ^ b: " + (var1 ^ var2));
      System.out.println("~a: " + ~var1);
   }
}
