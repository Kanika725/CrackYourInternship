class Solution {
    public String reverseWords(String s) {
        String reverse="";
        String str[]=s.split("\\s+");
        for(int i=str.length-1;i>=0;i--){
            reverse+=str[i]+" ";

        }
        return reverse.trim();
    }
}