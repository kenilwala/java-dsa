class ArrayReversal{
    static void reverArray(int[] arr){
        int n = arr.length;
        //temporary array to store reversed order
        int[] temp = new int[n];
        //copy element from original to temp in reverse order
        for(int i=0;i<n;i++)
            temp[i]= arr[n-i-1];
        //copy element back to originl array
        for(int i=0;i<n;i++)
            arr[i]=temp[i];
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};

        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println("");

        reverArray(arr);

        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
