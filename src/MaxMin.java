//Find the minimum and maximum element in an array

class MaxMin{
    public static void main(String[]args){

        int max=0;

        int []array= new int[]{10,13,14,15,16,19,45};
        for(int i=0; i<array.length;i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int min=array[0];
        for(int j=0; j<array.length; j++){
            if(array[j]< min){
                min = array[j];
            }
        }

        System.out.println("maximum value in array " +max);
        System.out.println("minimum value in array " +min);
    }
}

