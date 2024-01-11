class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> vowel=new ArrayList<>(s.length());
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
            vowel.add(a);
        }
        int j=vowel.size()-1;
        StringBuilder r=new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U' )
            r.append(vowel.get(j--));
            else
            r.append(a);
        }
        return r.toString();

    }
}
