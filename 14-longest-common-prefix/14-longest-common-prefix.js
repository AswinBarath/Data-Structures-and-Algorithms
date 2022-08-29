/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    strs.sort();
    let count = 0;
    let first = strs[0];
    let last = strs[strs.length - 1];
    for(let i=0; i<Math.min(strs[0].length, strs[strs.length - 1].length); i++) {
        if(first[i] === last[i]) count++;
        else break;
    }
    return first.substring(0, count);
};