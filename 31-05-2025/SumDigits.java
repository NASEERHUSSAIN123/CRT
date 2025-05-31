class SumDigits{
    static int addDigits(int n){
        return (1+(n-1)%9);
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(addDigits(n));
    }
}