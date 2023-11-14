# DSA - Time & Space Complexity

## Time complexity

* Time complexity is a measure of the amount of time an algorithm takes to run as a function of the size of its input. It provides an estimate of the upper bound on the running time of an algorithm, and it is expressed using big O notation (O(f(n))), where "f(n)" is a mathematical function representing the growth rate of the algorithm's running time concerning the size of the input (n).

* In simpler terms, time complexity helps us understand how the running time of an algorithm increases with the size of the input. The notation O(f(n)) is used to describe the upper limit of the growth rate, and it ignores constant factors and lower-order terms, focusing on the dominant factor that contributes most significantly to the running time as the input size becomes large.

Here are some common time complexity classes:

1. O(1): Constant time complexity. The running time of the algorithm remains constant regardless of the size of the input. An example is accessing an element in an array by index.
2. O(log n): Logarithmic time complexity. Common in algorithms that divide the input in each step, such as binary search on a sorted array.
3. O(n): Linear time complexity. The running time grows linearly with the size of the input. Examples include iterating through an array or list.
4. O(n log n): Linearithmic time complexity. Often seen in efficient sorting algorithms like merge sort and heap sort.
5. O(n^2): Quadratic time complexity. The running time is proportional to the square of the input size. Common in nested loops.
6. O(2^n): Exponential time complexity. The running time doubles with each addition to the input size. Common in brute-force algorithms.
