class SwapTwoNum{
    public static void main(String[] args) {
        int a = 6, b = 10;
        /*
         * int temp = a;
         * a = b; b = temp;
         */
        b = a+b;
        a = b-a;
        b = b-a;
        System.out.println("a: "+a+" b: "+b);
    }
}