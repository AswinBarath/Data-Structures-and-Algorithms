class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        for(String str: strs) {
            min = str.length() < min ? str.length() : min;            
        }
        String prefix = "";
        for(char cur=0; cur<min; cur++) {
            char c = strs[0].charAt(cur);
            int i;
            boolean flag = true;
            for(i=0; i<strs.length; i++) {
                if(c == strs[i].charAt(cur)) {
                    continue;
                }
                else {
                    flag = false;
                }
            }
            if(i >= strs.length && flag) {
                prefix += c;
            }
            if(flag == false){
                break;
            }
        }
        return prefix;
    }
}