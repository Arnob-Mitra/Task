/*LAB :1 Task
 Name: ARNOB MITRA UTSAB ; ID: 19101030
 section: 03 */

public class LinearArray{
  public static void main(String [] args){
    int [] a = {10, 20, 30, 40, 50, 60};
    
    System.out.println("\n///// TEST 01: Copy Array example /////");
    int [] b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    
    System.out.println("\n///// TEST 02: Print Reverse example /////");
    printArray(a); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    printReverse(a); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    
    
    System.out.println("\n///// TEST 03: Reverse Array example /////");
    reverseArray(b);
    printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    
    
    System.out.println("\n///// TEST 04: Shift Left k cell example /////");
    b = copyArray(a, a.length);
    b=shiftLeft(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 } 
    
    System.out.println("\n///// TEST 05: Rotate Left k cell example /////");
    b = copyArray(a, a.length); 
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=rotateLeft(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
    
    System.out.println("\n///// TEST 06: Shift Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=shiftRight(b,3);
    printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 } 
    
    System.out.println("\n///// TEST 07: Rotate Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=rotateRight(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
    
    
    System.out.println("\n///// TEST 08: Insert example 1 /////");
    
    b = copyArray(a, a.length);
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    boolean bol=insert(b,6, 70, 2); // This Should Print: No space Left 
    System.out.println(bol); // This Should Print: false
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    
    System.out.println("\n///// TEST 09: Insert example 2 /////");
    int [] c = {10, 20, 30, 40, 50, 0, 0}; 
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }
    bol=insert(c,5, 70, 2);  // This Should Print: Number of elements after insertion: 6
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    
    System.out.println("\n///// TEST 10: Insert example 3 /////");
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    bol=insert(c,6, 70, 6); // This Should Print: Number of elements after insertion: 7 
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    
    System.out.println("\n///// TEST 11: Remove example 1 /////");
    
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,90);
    System.out.println(bol); // This Should Print: false
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    
    System.out.println("\n///// TEST 12: Remove example 2 /////");
    printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,70);
    System.out.println(bol); // This Should Print: true
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 } */
    
    
    
  }
  //work:1
  // Prints the contents of the source array
  public static void printArray(int [] source){
    System.out.print("{ ");
    for(int i = 0 ; i<source.length-1 ; i++){
      System.out.print(source[i]+", ");
      
    }
    System.out.println(source[source.length-1]+" }");
  }
  
  
  //work:2
  // Prints the contents of the source array in reverse order
  public static void printReverse(int [] source){
    // TO DO
    System.out.print("{ ");
    for(int i = source.length-1 ; i>0 ; i--){
      System.out.print(source[i]+", ");
      
    }
    System.out.println(source[0]+" }");
  }
  
  
  //work:3
  // creates a copy of the source array and returns the reference of the newly created copy array
  public static int [] copyArray(int [] source, int len){
    // TO DO
    int[] newArr = new int[len];
    System.arraycopy(source, 0, newArr, 0, newArr.length);
    
      return newArr;    
  }  
  
  
  //work:4
  // creates a reversed copy of the source array and returns the reference of the newly created reversed array
  public static void reverseArray(int [] source){
    int j = source.length-1;
    for(int i = 0 ; i<source.length/2 ; i++){
      int temp = source[i];
      source[i] = source[j];
      source[j] = temp;
      j--;
    }
  }
  
  
  //work:5
  // Shifts all the elements of the source array to the left by 'k' positions
  // Returns the updated array
  public static int [] shiftLeft(int [] source,  int k){
    int j = 0;
    for(int i = k;  i<source.length ; i++){
      source[j] = source[i];
        j++;
    }
    
     for(int i = k ; i<source.length ; i++){
       source[i] = 0;
    }
    
     return source;    
  }
     
     
     
  //work:6     
  // Rotates all the elements of the source array to the left by 'k' positions
  // Returns the updated array
  public static int [] rotateLeft(int [] source, int k){
    int temp[] = new int [source.length];
    System.arraycopy(source, 0, temp, 0, temp.length);
    int a = 0;
    for(int i = k ; i<source.length ; i++){
      source[a] = temp[i];
      a++;
    }
    int j = 0;
    for(int i = k ; i<source.length ; i++){
      source[i] = temp[j];
      j++;
    }
    return source;   
  }
  
 
    
 //work:7
  // Shifts all the elements of the source array to the right by 'k' positions
  // Returns the updated array
  public static int [] shiftRight(int [] source, int k){
    for(int i = k ; i<source.length ; i++){
      source[i] = source[i-k];
    }
    for(int i = 0 ; i<k ; i++){
      source[i] = 0;
    }
    return source;    
  }
  
  
   //work:9  
  // Rotates all the elements of the source array to the right by 'k' positions
  // Returns the updated array
  public static int [] rotateRight(int [] source, int k){
    int temp[] = new int [source.length];
    System.arraycopy(source, 0, temp, 0, temp.length);
    
    int a = 0;
    for(int i = k ; i<source.length ; i++){
      source[a] = temp[i];
      a++;
    }
    int j = 0;
    for(int i = k ; i<source.length ; i++){
      source[i] = temp[j];
      j++;
    }
    return source; 
  }
  
  /** @return true if insertion is successful; @return false otherwise
    * @param arr the reference to the linear array
    * @param size the number of elements that exists in the array. size<=arr.length
    * @param elem the element that is to be inserted
    * @param index the index in which the element is required to be inserted
    * if insertion is not successful due to lack space, print "No space Left"
    * if given index is invalid, print "Invalid Index"
    * if insertion is successful, print the 'Number of elements after insertion' is completed
    */
  
  //work:10
  public static boolean insert(int [] arr, int size, int elem, int index){
    boolean check = false;
    
    if(size>arr.length-1){
      check = false;
      System.out.println("No Space left");
    }
    else if(index>arr.length-1){
      System.out.println("Invalid Index");
    }
    else if (size<arr.length){
      check = true;
      
      System.out.println("Number of elements after insertaion: "+(size+1));
         for(int i = size-1 ; i>=index ; i--){
        arr[size] = arr[i];
          size--;
      }
         arr[index] = elem;
    }
    return check;  
  }
  
  /** 
   * removes all the occurences of the given element
   * @param arr the reference to the linear array
   * @param size the number of elements that exists in the array. size<=arr.length
   * @param elem the element to be removed
   * @return true if removal is successful; return false otherwise
   * if removal is successful, print the 'Number of elements after removal' is completed
   */  
 
 //work:11
  public static boolean removeAll(int [] arr, int size, int elem){
    boolean check = false;
    int count = 0;
    for(int i = 0 ; i<arr.length ; i++){
      if(arr[i] == elem){
        count++;
      }
    }
    if (count == 0){
       check = false;
    }
    
    else{
      check = true;
      for(int i = 0 ; i<arr.length ; i++){
         if(arr[i] == elem){
          for(int j = i ; j<arr.length-1 ; j++){
             arr[j] = arr[j+1];
            size--;
          }
        }
      }
      int length = arr.length-1;
      for(int i = 0 ; i<size ; i++){
           arr[length] = 0;
           length--;
      }
    }
    return check;    
  }
}