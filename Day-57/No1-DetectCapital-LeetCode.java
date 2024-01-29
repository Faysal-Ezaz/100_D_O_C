class Solution {
    public boolean detectCapitalUse(String word) {
        boolean allCap = false, firstCap = false, allSmall = false;

        if(word.charAt(0) >= 65 && word.charAt(0) <= 90){
            if(word.length() > 1 && word.charAt(1) >= 65 && word.charAt(1) <= 90)
                allCap = true;
            else
                firstCap = true;
        }
        else
            allSmall = true;
        for(int i = 1; i < word.length(); i++){
            if(allCap){
                if(word.charAt(i) < 65 || word.charAt(i) > 90)
                    return false;
            }
            if(firstCap){
                if(word.charAt(i) < 97 || word.charAt(i) > 122)
                    return false;
            }
            if(allSmall){
                if(word.charAt(i) < 97 || word.charAt(i) > 122)
                    return false;
            }
        }
        return true;
    }
}
