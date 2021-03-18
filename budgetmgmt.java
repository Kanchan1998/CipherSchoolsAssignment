import java.io.*;
import java.util.ArrayList;
class budgetmgmt
{
public static void main(String args[]) throws IOException
{
 double budget=0.0,quantity=0.0,price=0.0,remaining_amount=0.0,final_price=0.0;
 int choice=1;
 String name="";
  
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter your budget:");
  budget=Double.parseDouble(br.readLine());
   
    while(choice==1){
  System.out.println("1. Add an item: ");
  System.out.println("2. Exit");

  System.out.println("Enter Your Choice: ");
  choice=Integer.parseInt(br.readLine());

  if(choice==1)
  {   
     
     System.out.println("Enter Product name:");
     name=br.readLine();
     while((name==null) || (name.equals(" ")) || (!name.matches("^[a-zA-Z]*$")))
    { 
      System.out.println("please enter valid product name");
      name=br.readLine();
    }


    System.out.println("Enter Product quantity:");
    quantity=Double.parseDouble(br.readLine());
      

    System.out.println("Enter Product price:");
    price=Double.parseDouble(br.readLine());
    final_price=price*quantity;
    System.out.println("Final price: "+final_price);
	
	remaining_amount=budget-final_price;
       if(remaining_amount>=0){
       System.out.println("Your remaining amount is "+remaining_amount);
       }
  budget=budget-final_price;
  if(budget<=0)
  {  
    System.out.println(" Sorry,your budget is over");
  }
  else if(budget<remaining_amount)
  {
   System.out.println("Sorry,your remaining budget is- "+remaining_amount);
  }
  
  }

  else if(choice==2)
  {
   
   if(remaining_amount>0)
   {
	   System.out.println("Amount left you can buy more items");
	   System.out.println("Exit.");
   }
   else
   {
	   System.out.println("Exit.");
   }
      
    /* System.out.println("Your Bill is -");
	
	ArrayList<String> list=new ArrayList<String>();
        list.add(name);
	for(String n1:list)
	{
		System.out.println("Product Name- "+n1);
	}
	ArrayList<Double> list1=new ArrayList<Double>();
        list1.add(quantity);
	for(double q1:list1)
	{
		System.out.println("Product Quantity- "+q1);
	}
	ArrayList<Double> list2=new ArrayList<Double>();
         list2.add(final_price);
	for(double f1:list2)
	{
		System.out.println("Product Price "+f1);
	}*/
   
  }
    
	
	
}
}
}