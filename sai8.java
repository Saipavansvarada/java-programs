public class sai8{
public static void main(String[] args) {
String str1 = "Hello, World!";
String str2 = "hello, world!";
// 1. Character Extraction
System.out.println("Character Extraction:");
System.out.println("Character at index 7 in str1: " +
str1.charAt(7));
System.out.println();
// 2. String Comparison
System.out.println("String Comparison:");
System.out.println("str1 equals str2? "+
str1.equals(str2));
System.out.println("str1 equalsIgnoreCase str2? "+
str1.equalsIgnoreCase(str2));
System.out.println("str1 compareTo str2: "+
str1.compareTo(str2));
System.out.println();

// 3. String Searching
System.out.println("String Searching:");
System.out.println("Does str1 contain 'World'? "+
str1.contains("World"));
System.out.println("Index of 'o' in str1: "+
str1.indexOf('o'));
System.out.println("Last index of 'o' in str1: "+
str1.lastIndexOf('o'));
System.out.println("Does str1 start with 'Hello'? "+
str1.startsWith("Hello"));
System.out.println("Does str1 end with '!'? "+
str1.endsWith("!"));
System.out.println();
// 4. String Modification
System.out.println("String Modification:");
System.out.println("str1 to upper case: "+
str1.toUpperCase());
System.out.println("str2 to lower case: "+
str2.toLowerCase());
System.out.println("Replace 'World' with 'Java': "+
str1.replace("World", "Java"));
System.out.println("Substring from index 7: "+
str1.substring(7));
System.out.println("Substring from index 0 to 5: "+
str1.substring(0, 5));
System.out.println("Trimmed string: " + (" Hello Java! ".trim()));
}
}