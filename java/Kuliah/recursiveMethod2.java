public static void main(String [] args){
    recursiveMethod2(5,2);
    
    public void recursiveMethod2(int a, int b){
    if(b==1){
        System.out.println(a);
    }
    else{
        System.out.print(a*b+", ");
        recursiveMethod2(a, b-1);
        System.out.println(", "+a*b);
    }
}
}




