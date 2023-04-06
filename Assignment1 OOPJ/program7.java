class program7{
    public static void main(String[] args)
    {
        char c= args[0].charAt(0);
        int a=(int)c;
        if ((a >= 48 && a <= 57)  || (a>=97 && a<=122)  || (a>=65 && a<=90))
        {
             if(a>=48 && a<=57)
             {
               System.out.println("Entered number :"+ c);
               System.out.println("Unicode : "+ a);
             }
          else if ((a>=97 && a<=122))
          {
            System.out.println("Entered number :"+ Character.toUpperCase(c));
            System.out.println("Unicode : "+ a);
          }
          else if ((a>=65 && a<=90))
          {
            System.out.println("Entered number :"+ Character.toLowerCase(c));
            System.out.println("Unicode : "+ a);
          }
        

        }
    }
}