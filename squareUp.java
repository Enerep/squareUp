public int[] squareUp(int n) {
  int[] arr = new int[n*n]; 
  
  

  for(int i = 0 ; i < n*n ; i++){
    arr[i] = 0;
  }
  
  // n = 2; 
  int cI = 1;
  int iteration = 1;
  int hM = 1;
  for(int i = 0 ; i != (n*n) ; i+=n){
    //check last element to first element of i
    for(int j = (cI*n) ; j != ((cI-1)*n) ; j--){
      if(hM < iteration)
        break;
      arr[j-1] = iteration;
      iteration++;
    }
    hM++;
    iteration = 1;
    cI++;
  }
  
  return arr;
}
