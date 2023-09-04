class perfect
{
public static void main(String argss[])
{
int i=1,num=4,count=0;
while(i<num)
{
if(num%i==0)
{
count=count+i;
}
i++;
}
if(count==num)
{
System.out.print("perfect number");
}
else
{
System.out.println("not a perfect");
}
}
}


