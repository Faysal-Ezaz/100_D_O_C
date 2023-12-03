class Solution {
    public boolean isPalindrome(int x) {
        // Firstly I will check if the number is 0. If so the number is boolean.
        if(x == 0){
            return true; 
        }
        // Secondly I will check for non zero number, '-' sign or if the number ends with 0.
        if((x < 0) || (x%10 == 0)){return false;}
        // Now that I have check for the above conditions, I will start off with the main part

        boolean value = false; 
        int remainder = 0;
        int newNo = x;
        while(x!=0){
            remainder = remainder * 10 + x % 10; 
            x = x / 10; 
        }  
        if(remainder == newNo || remainder == 0){
            value = true; 
        }
        return value;
    }
} 

// I will add the Description later on.
