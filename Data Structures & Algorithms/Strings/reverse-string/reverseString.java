public class reverseString {
  public static String reverseString(String str){
    String reversed = "";
    for (int i = str.length() - 1; i>=0; i--){
      reversed = reversed + str.charAt(i);
    }
    return reversed;
  }

  public static void main(String[] args){
    String str = "Camel";
    System.out.println("Reversed string is : " + reverseString(str));
  }
}
