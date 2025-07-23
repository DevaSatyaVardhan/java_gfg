class Solution {
    // code here
    static int returnValueFunction(int n){
        return 2*n;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         a = returnValueFunction(a);
        System.out.println(a);
    }
}
