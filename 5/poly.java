import java.util.Scanner;
public class poly {
public static boolean usrstrcmp(String s1,String s2){
if(s1.length() != s2.length()){
return false;
}
else{
for(int i=0;i<s1.length();i++){
if(s1.charAt(i) != s2.charAt(i)){
return false;
}
}
return true;
}
}
public static boolean usrstrcmp(String s1,String s2,int n){
for(int i=0;i<n;i++){
if(s1.charAt(i) != s2.charAt(i)){
return false;
}
}
return true;
}
public static void main(String[] args){
Scanner scn = new Scanner(System.in);
System.out.println("Enter the first string");
String str1 = scn.next();
System.out.println("Enter the second string");
String str2 = scn.next();
System.out.println("Enter the number of characters to compare");
int n = scn.nextInt();
if(usrstrcmp(str1,str2)){
System.out.println("Both the strings are equal");
}
else{
System.out.println("Both the strings are not equal");
}
if(usrstrcmp(str1,str2,n)){
System.out.println("Both the strings are equal till " + n);
}
else{
System.out.println("Both the strings are not equal till " + n);
}
}
}
