/*
 * function for calculate power of a prime factor m
 * from canonical form of factorial n!
 * @param n - integer value of n
 * @param m - integer, some factor of n!
 * @return - power of factor m in canonical form of n!
 */
var F = function(n, m) {

  /* function for compute all prime divisors
   * @return - array of divisors
   */
  var divisors = function(n) {
    var result = [], i;
    for (i=2; i<=Math.sqrt(n); i++) {
      if (n % i === 0) {
        result.push(i);
        result = result.concat(divisors(n/i));
        return result;
      }
    }
    result.push(n);
    return result;
  };

  /* function for count powers of divisor m
   * @param m - integer divisor
   * @param numbers - array of divisors
   * @return - integer value of power
   */
  var power = function(m, numbers) {
    var i, p = 0, len = numbers.length;
    for (i=0; i<len; i++) {
      if (m === numbers[i]) p++;
    }
    return p;
  };

  var i, p = 0;
  for (i=1; i<=n; i++) {
    p+=power(m, divisors(i));
  }
  return p;
};

// examples of usage
var canonical = function (n) {
  var result = '';
  var i, first = true;
  result = n + '! = ';
  for (i=2; i<=n; i++) {
    var power = F(n, i);
    if (power > 0)
      result += ((first)?(first=false):' * ') + i + '^' + power;
  }
  return result;
};
console.log(canonical(20));
