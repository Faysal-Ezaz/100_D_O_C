public class Solution {
    public static int countDigits(int n){
        int count = 0; 
        String str = Integer.toString(n); 
        for(int i = 0; i < str.length(); i++){
            int digit = Character.getNumericValue(str.charAt(i)); 
            if(digit!=0 && n%digit==0){
                count++; 
            }
        } 
        return count; 
    }
}
