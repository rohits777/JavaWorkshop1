//How to find duplicate elements in a given Array?

//String[]  arr1 = {"abc", "java", "javahungry", "java", "javahungry" };

public class DuplicateArray {
    public static void main(String[] args) {

        String[] arr={"abc", "java", "javahungry", "java", "javahungry" };

        for(int i=0; i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j])
                    System.out.println(arr[j]);

            }
        }


    }

}
