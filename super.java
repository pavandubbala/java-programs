public class super
{
 public static void main(String args[])
{
int count=0,start=1,end=10;
while(start<=end)
{
if(end%start==0)
{
count++;
}
start++;
}
if(count<=3)
{
System.out.println("Super no");
}
else
{
System.out.println(" not a Super no");
}
}
}