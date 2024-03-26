class p1e2{
    public static void main(String args[]){
        int a=2;
        int n=Integer.parseInt(args[0]);
        while(n>1){
            if(n%a==0){
                System.out.print(a+",");
                 n=n/a;
            }
            else{
                a++;
            }
        }
    }
}