/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    // Debugging
    // console.log(args.length);
    return args.length;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */