class Solution {
    int missingNumber(int array[], int n) {
        // the general concept of this problem is as follows: 
        // we will take two variables, one that will print the total, and another that will print the sum nos.
        // then we substract the two numbers. By doing this we will get the missing number. 
        int total = n*(n+1)/2; 
        int sum = 0; 
        for(int i = 0; i<n-1; i++){
            sum+=array[i]; 
        }
        return (total - sum); 
    }
} 


// I shall add the detailed explaination later on.
