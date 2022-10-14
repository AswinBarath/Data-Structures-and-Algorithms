/**
 * @param {string} s
 * @return {string}
 */
 var removeDuplicates = function(s) {
    if(s.length == 1) {
        return s;
    }
    let stack = [];
    
    for(let char of s) {
        if(stack.length > 0 && stack[stack.length-1] === char) {
            stack.pop();
        } else {
            stack.push(char);
        }
    }
    return stack.join("");
};