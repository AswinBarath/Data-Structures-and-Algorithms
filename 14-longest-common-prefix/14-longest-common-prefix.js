/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    strs.sort();
    let count = 0;
    for(let i=0; i<Math.min(strs[0].length, strs[strs.length - 1].length); i++) {
        if(strs[0][i] === strs[strs.length - 1][i]) count++;
        else break;
    }
    return strs[0].substring(0, count);
};