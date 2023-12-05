class Solution {
    public int romanToInt(String s) {
        
        int result = 0;

        if (s == null || s.isBlank() || s.length() < 1 || s.length() > 15) {
        return result;
        }

        int n = s.length();
        int i=0;
        while(i < s.length()) {
            char ch = s.charAt(i);

            if(ch=='M') {
                result += 1000;
            }
            else if(ch=='D') {
                result += 500;
            }
            else if(i+1 < n && ch=='C' && s.charAt(i+1)=='D') {
                result -= 100;
            }
            else if(i+1 < n && ch=='C' && s.charAt(i+1)=='M') {
                result -= 100;
            }
            else if(ch=='C') {
                result += 100;
            }
            else if(ch=='L') {
                result += 50;
            }
            else if(i+1 < n && ch=='X' && s.charAt(i+1)=='L') {
                result -= 10;
            }
            else if(i+1 < n && ch=='X' && s.charAt(i+1)=='C') {
                result -= 10;
            }
            else if(ch=='X') {
                result += 10;
            }
            else if(ch=='V') {
                result += 5;
            }
            else if(i+1 < n && ch=='I' && s.charAt(i+1)=='V') {
                result -= 1;
            }
            else if(i+1 < n && ch=='I' && s.charAt(i+1)=='X') {
                result -= 1;
            }
            else if(ch=='I') {
                result += 1;
            }
            i++;
        }

        return result;
    }
}
