package practice;

class ClassE
{
   public static void main(String args[])
   {
       for ( int i = 0 ; i<=10 ;i++ )
       {
           if (i%3==0){
        	  System.out.print("N");
           }
           else
        	 if(i%5==0) {
        		 System.out.print("S");  
        	 }
           	 else {
        	   if(i%3==0 && i%5==0)
           {
         System.out.print("NS");
            } }
   }
   }
}