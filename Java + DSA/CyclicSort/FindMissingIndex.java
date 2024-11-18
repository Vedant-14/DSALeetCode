
    public class FindMissingIndex {
            public static void main(String[] args) {
                int[] arr = {0,4,2,1};
                System.out.println(missingIndex(arr));

            }
            // In array where the elements are continuos and are in range of 0-N then their is applied cyclic sort 
            public static int missingIndex(int[] arr) {
                int i =0;
                while (i<arr.length) {
                    int correct = arr[i];  // Here the correct index of element will be the element value itself 
                    if(arr[i]<arr.length && arr[i]!=arr[correct]) {
                        swap(arr,i,correct);
                    }
                    else {
                        i++;
                    }
                }
                // Now finding the missing index after the array is completly sorted 
                for ( i = 0;i<arr.length;i++) {
                    if(arr[i]!=i) {
                        return i;
                    }
                    
                }
                return arr.length;

                
            }
            static void  swap(int[] arr,int first , int second) {
                        int temp = arr[first];
                        arr[first] = arr[second];
                        arr[second] = temp;
            }
            
    }
