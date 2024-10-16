class Solution{
public  void printnos (int N){
if(N == 0){
return ; 
}
else{
  printnos(N-1) ; 
  System.out.print(" " + N);
}
