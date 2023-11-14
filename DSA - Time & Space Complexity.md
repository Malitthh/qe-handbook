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

## Space complexity

Is the amount of memory taken by an algorithm to run as a function of input size.

## Algorithms

An algorithm is a set of well-defined instructions to solve a particular problem.

* Characteristics of Algorithms
1. Well defined inputs and outputs
2. Each step should be clear
3. Language independent

The number of algorithms is vast and continually expanding as researchers and developers create new solutions to various problems. Algorithms are essentially step-by-step procedures or formulas for solving problems, and they exist in virtually every field of computer science and beyond.

Here are some broad categories of algorithms, each containing numerous specific algorithms:

1. Sorting Algorithms:

* Bubble Sort
* Selection Sort
* Insertion Sort
* Merge Sort
* Quick Sort
* Heap Sort
* Radix Sort, etc.

2. Searching Algorithms:

* Linear Search
* Binary Search
* Hashing Algorithms (for hash tables), etc.

3. Graph Algorithms:

* Depth-First Search (DFS)
* Breadth-First Search (BFS)
* Dijkstra's Algorithm
* Bellman-Ford Algorithm
* Kruskal's Algorithm
* Prim's Algorithm, etc.

4. Dynamic Programming Algorithms:

* Fibonacci sequence using dynamic programming
* Longest Common Subsequence
* Knapsack Problem
* Shortest Path in a Graph
* Matrix Chain Multiplication, etc.

5. Divide and Conquer Algorithms:

* Merge Sort
* Quick Sort
* Strassen's Matrix Multiplication, etc.

6. Greedy Algorithms:

* Kruskal's Algorithm
* Prim's Algorithm
* Dijkstra's Algorithm
* Huffman Coding, etc.

7. String Algorithms:

* Pattern Matching Algorithms (e.g., KMP, Rabin-Karp)
* Longest Common Substring
* Edit Distance, etc.

8. Numerical Algorithms:

* Euclidean Algorithm (for finding the greatest common divisor)
* Fast Fourier Transform (FFT)
* Primality Testing Algorithms, etc.

9. Machine Learning Algorithms:

* Linear Regression
* Decision Trees
* Support Vector Machines
* Neural Networks
* K-Means Clustering, etc.

10. Cryptography Algorithms:

* RSA Algorithm
* AES (Advanced Encryption Standard)
* Diffie-Hellman Key Exchange, etc.

These are just a few examples, and there are many more algorithms in each category. 

1. Sorting Algorithms:
* Bubble Sort:
Description: Repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
Daily Industry Use: Rarely used in practice due to its inefficiency with large datasets.

* Selection Sort:
Description: Divides the array into a sorted and an unsorted region, repeatedly selects the smallest element from the unsorted region, and swaps it with the first element of the unsorted region.
Daily Industry Use: Similar to bubble sort, not commonly used for large datasets.

* Insertion Sort:
Description: Builds the final sorted array one item at a time, taking each element from the input data and inserting it into its correct position.
Daily Industry Use: Useful for small datasets or nearly sorted data.

* Merge Sort:
Description: Divides the unsorted list into n sub-lists, each containing one element, and repeatedly merges sub-lists to produce new sorted sub-lists.
Daily Industry Use: Efficient for large datasets, commonly used in practice.

* Quick Sort:
Description: Selects a 'pivot' element and partitions the other elements into two sub-arrays according to whether they are less than or greater than the pivot.
Daily Industry Use: Efficient for in-memory sorting, often used in standard libraries.

* Heap Sort:
Description: Builds a max-heap (or min-heap) and repeatedly extracts the maximum (or minimum) element to form a sorted array.
Daily Industry Use: Efficient for large datasets, commonly used in practice.

* Radix Sort:
Description: Sorts numbers by processing individual digits, from the least significant digit to the most significant digit.
Daily Industry Use: Efficient for sorting integers with a fixed number of digits.

2. Searching Algorithms:

* Linear Search:
Description: Iterates through each element in a list until the target element is found.
Daily Industry Use: Simple and used when the data is not sorted or the dataset is small.

* Binary Search:
Description: Divides a sorted array in half and eliminates half of the remaining elements at each step.
Daily Industry Use: Efficient for sorted data, commonly used in practice.

*Hashing Algorithms (for hash tables):
Description: Uses a hash function to map keys to indices, enabling constant-time average-case access.
Daily Industry Use: Essential for implementing hash tables for fast data retrieval.

3. Graph Algorithms:

* Depth-First Search (DFS):
Description: Explores as far as possible along each branch before backtracking.
Daily Industry Use: Used in topological sorting, solving puzzles, and analyzing connectivity in graphs.

* Breadth-First Search (BFS):
Description: Traverses or searches through the nodes of a graph level by level.
Daily Industry Use: Used in network analysis, social network analysis, and shortest path problems.

* Dijkstra's Algorithm:
Description: Finds the shortest path between two nodes in a graph with non-negative weights.
Daily Industry Use: Used in network routing protocols to find the most efficient path.

* Bellman-Ford Algorithm:
Description: Finds the shortest path between two nodes in a graph, allowing for negative weight edges.
Daily Industry Use: Handles graphs with negative weight edges, but less efficient than Dijkstra's algorithm.

* Kruskal's Algorithm:
Description: Finds the minimum spanning tree of a connected, undirected graph.
Daily Industry Use: Used in network design and optimization.

* Prim's Algorithm:
Description: Finds the minimum spanning tree of a connected, undirected graph.
Daily Industry Use: Similar to Kruskal's algorithm, used in network design and optimization.

4. Dynamic Programming Algorithms:

* Fibonacci sequence using dynamic programming:
Description: Computes Fibonacci numbers efficiently by storing intermediate results.
Daily Industry Use: Used in optimization problems, such as resource allocation.

* Longest Common Subsequence:
Description: Finds the longest subsequence common to two sequences.
Daily Industry Use: Used in bioinformatics, version control systems, and data comparison.

* Knapsack Problem:
Description: Finds the most valuable combination of items to include in a knapsack without exceeding its capacity.
Daily Industry Use: Applied in resource allocation and optimization problems.

* Shortest Path in a Graph:
Description: Finds the shortest path between two nodes in a graph.
Daily Industry Use: Used in various applications, such as navigation systems and network routing.

* Matrix Chain Multiplication:
Description: Finds the most efficient way to multiply a given sequence of matrices.
Daily Industry Use: Applied in optimization problems, such as in graphics processing.

5. Divide and Conquer Algorithms:

* Merge Sort:
Description: Divides the unsorted list into n sub-lists, each containing one element, and repeatedly merges sub-lists to produce new sorted sub-lists.
Daily Industry Use: Efficient for large datasets, commonly used in practice.

* Quick Sort:
Description: Selects a 'pivot' element and partitions the other elements into two sub-arrays according to whether they are less than or greater than the pivot.
Daily Industry Use: Efficient for in-memory sorting, often used in standard libraries.

* Strassen's Matrix Multiplication:
Description: Multiplies two matrices more efficiently than the standard method.
Daily Industry Use: Applied in various numerical computing tasks.

6. Greedy Algorithms:

* Kruskal's Algorithm:
Description: Finds the minimum spanning tree of a connected, undirected graph by adding the smallest edge that connects two distinct trees at each step.
Daily Industry Use: Used in network design and optimization.

* Prim's Algorithm:
Description: Finds the minimum spanning tree of a connected, undirected graph by adding the smallest edge that connects a vertex in the tree to a vertex outside the tree.
Daily Industry Use: Similar to Kruskal's algorithm, used in network design and optimization.

* Dijkstra's Algorithm:
Description: Finds the shortest path between two nodes in a graph by selecting the smallest edge at each step.
Daily Industry Use: Used in network routing protocols to find the most efficient path.

* Huffman Coding:
Description: Creates a variable-length prefix coding to represent characters in a file, with shorter codes assigned to more frequent characters.
Daily Industry Use: Used in data compression algorithms, such as those applied to file compression and data transmission.

7. String Algorithms:

* Pattern Matching Algorithms (e.g., KMP, Rabin-Karp):
Description: Efficiently finds occurrences of a pattern in a text.
Daily Industry Use: Used in text editors, search engines, and bioinformatics.

* Longest Common Substring:
Description: Finds the longest contiguous substring present in two given strings.
Daily Industry Use: Used in bioinformatics, data comparison, and plagiarism detection.

* Edit Distance:
Description: Measures the similarity between two strings by counting the minimum number of operations (insertions, deletions, or substitutions) required to transform one string into the other.
Daily Industry Use: Used in spell checking, DNA sequence analysis, and natural language processing.

8. Numerical Algorithms:

* Euclidean Algorithm (for finding the greatest common divisor):
Description: Finds the greatest common divisor (GCD) of two integers.
Daily Industry Use: Used in various applications, such as cryptography and error detection.

* Fast Fourier Transform (FFT):
Description: Efficiently computes the discrete Fourier transform of a sequence.
Daily Industry Use: Widely used in signal processing, image processing, and data compression.

* Primality Testing Algorithms:
Description: Determines whether a given number is prime.
Daily Industry Use: Used in cryptography, particularly in protocols like RSA.

9. Machine Learning Algorithms:

* Linear Regression:
Description: Models the relationship between a dependent variable and one or more independent variables by fitting a linear equation to the observed data.
Daily Industry Use: Commonly used in predictive modeling, such as predicting sales based on advertising spend.

* Decision Trees:
Description: Constructs a tree-like model of decisions based on multiple conditions.
Daily Industry Use: Used in various applications, including classification and regression tasks.

* Support Vector Machines:
Description: Constructs a hyperplane in a high-dimensional space that separates data points into classes.
Daily Industry Use: Used in classification and regression tasks, including image classification and text categorization.

* Neural Networks:
Description: Models inspired by the human brain, consisting of interconnected nodes (neurons) organized into layers.
Daily Industry Use: Widely used in deep learning for tasks such as image and speech recognition.

* K-Means Clustering:
Description: Divides a set of data points into clusters, where each data point belongs to the cluster with the nearest mean.
Daily Industry Use: Applied in data segmentation, customer segmentation, and image compression.

10. Cryptography Algorithms:

* RSA Algorithm:
Description: A widely used public-key cryptosystem that enables secure data transmission.
Daily Industry Use: Applied in secure communication protocols, including HTTPS for secure web browsing, online banking transactions, and digital signatures.

* AES (Advanced Encryption Standard):
Description: A symmetric encryption algorithm widely used for securing sensitive data.
Daily Industry Use: Used in various applications, including encrypting files, communication, and securing network traffic.

* Diffie-Hellman Key Exchange:
Description: Allows two parties to agree on a shared secret key over an insecure communication channel.
Daily Industry Use: Used in secure communication protocols to establish a shared secret key for encrypted communication.
