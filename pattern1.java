import java.io.*;
class pattern1
{
public static void main(String args[]) throws IOException
{
int i,j,n,k;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number:");
n=Integer.parseInt(br.readLine());


for(i=1;i<=n;i++)
{
for(j=n;j>=i;j--)
{
System.out.print(" ");
}
for(k=1;k<=i;k++)
{
System.out.print(" *");
}
System.out.print("\n");
}
}
}