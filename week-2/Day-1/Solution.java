
// create a class addition
// with a static function add
// this should return the sum of
// two values(a,b) passed in the parameter

// code here
 class Addition
{
    static int add(int a,int b)
    {
       return a+b;
    }
    
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      int result = add(a,b);
      System.out.println(result);
  }
}