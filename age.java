class ScannerDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String name;
int age;
age=sc.nextInt();
sc.nextLine();
name=sc.nextLine();
System.out.println(" Hello Mrs="+name+" your age="+age);
}
}
