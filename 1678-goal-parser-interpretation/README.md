<h2><a href="https://leetcode.com/problems/goal-parser-interpretation/">1678. Goal Parser Interpretation</a></h2><h3>Easy</h3>
You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.

 

<h2>Example 1:</h2>

<pre>Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".</pre>

<h2>Example 2:</h2>

<pre>Input: command = "G()()()()(al)"
Output: "Gooooal"
Example 3:

Input: command = "(al)G(al)()()G"
Output: "alGalooG"</pre>
 

<h2>Constraints:</h2>

1 <= command.length <= 100
command consists of "G", "()", and/or "(al)" in some order.
