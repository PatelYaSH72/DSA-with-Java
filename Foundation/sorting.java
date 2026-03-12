/*
Question : Use the following sorting algorithms to sort an array in DESCENDING order :
a. Bubble Sort
b. Selection Sort
c. Insertion Sort
d. Counting Sort
*/

public class sorting {

  public static void bubble(int arr[]) {
    for(int i = 0; i < arr.length - 1; i++){

      
      for(int j = 0; j < arr.length - 1 - i; j++){

        if (arr[j] > arr[j+1]) {
           int temp = arr[j];
           arr[j] = arr[j+1];
           arr[j+1] = temp;
        }

      }

    }
  }

  public static void selctionsort(int arr[]) {
      for(int i = 0; i < arr.length-1; i++){
        int minPos = i; 
 
            for(int j = i+1; j < arr.length; j++){
                if (arr[minPos] > arr[j]) {
                      minPos = j;                  
                }
            }

            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

      }
    }

  public static void insertionsort(int arr[]) {
       for(int i = 1; i<arr.length; i++){
         int curr = arr[i];
         int prev = i-1;

         // Finding out the correct pos to insert
         while (prev >= 0 && arr[prev] > curr) {
          arr[prev+1] = arr[prev];
          prev--;
         }

          arr[prev+1] = curr;

       }
    }

  public static void countingSort(int arr[]){

        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
          largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];

        for(int i = 0; i < arr.length; i++){
          count[arr[i]]++;
        }

        int j = 0;
        for(int i = 0; i<count.length; i++){
            while (count[i] > 0) {
              arr[j] = i;
              j++;
              count[i]--;
            }
        }

    }

  public static void printArr(int arr[]) {
    for(int i = 0; i<=arr.length-1; i++){
      System.out.print(arr[i]);
    }
  }
  
  public static void main(String[] args) {
    
    int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

    bubble(arr);
    selctionsort(arr);
    insertionsort(arr);
    countingSort(arr);
    printArr(arr);

  }

}

/*
output: 
a. Bubble Sort    : 1123345678
b. Selection Sort : 1123345678
c. Insertion Sort : 1123345678
d. Counting Sort  : 1123345678
*/