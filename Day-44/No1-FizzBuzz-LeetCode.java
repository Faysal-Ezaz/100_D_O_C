class Solution {
    public List<String> fizzBuzz(int n) {
        LinkedList ls=new LinkedList<String>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                ls.add("FizzBuzz");
            }else if(i%3==0){
                ls.add("Fizz");
            }else if(i%5==0){
                ls.add("Buzz");
            }else{
                ls.add(String.valueOf(i));
            }
        }
        return ls;

    }
}
