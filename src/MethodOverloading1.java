class MethodOverloading1{
    private static void display(int a){
        System.out.println("Arguments:" + a);
    }
    private static void display(int a , int b){
        System.out.println("Arguments:" + a +  "And"  + b );
        System.out.println("bhavitha");
    }
    public static void main(String args[]){
        display(1);
        display(1 ,4);
    }
}
