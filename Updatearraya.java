import java.util.*;
class Updatearraya
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter array size");
int n= sc.nextInt();
ArrayList<Integer>a=new ArrayList<Integer>();
System.out.println("Enetr "+n+"values");
for(int i=0;i<n;i++)
{
a.add(sc.nextInt());
}
System.out.println("Enter array value to update");
int val=sc.nextInt();
int upd=sc.nextInt();
if(a.contains(val))
{
int index =a.indexOf(val);
a.set(index,upd);
for(Integer i:a){

System.out.println(i+" ");
}}
else
{

System.out.println("not updateable");
}}}