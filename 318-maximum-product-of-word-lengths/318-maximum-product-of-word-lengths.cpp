class Solution {
public:
    int maxProduct(vector<string>& words) {
        int n = size(words), ans = 0;
        vector<int> mask(n);
        for(int i = 0; i < n; i++) {
            for(auto& ch : words[i])           
                mask[i] |= 1 << (ch - 'a');     // hash the word
            for(int j = 0; j < i; j++)
                // no common set bit in the hash of words[i] and words[j]
                if((mask[i] & mask[j]) == 0)    
                    ans = max(ans, int(size(words[i]) * size(words[j])));
        }   
        return ans;
    }
};