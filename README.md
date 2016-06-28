# java-number-pyramid
Code from a prompt to improve a nested loop that prints some text in a pleasing way.
This new version uses only one for loop and prompts the user for the dimensions of the printed output.

Original code:
for (int i = 1; i <= 5; i++) {
  for (int j = 1; j <= (5 - i); j++) {
    System.out.print(".");
  }
  for (int k = 1; k <= i; k++) {
    System.out.print(i);
  }
  System.out.println();
}

Original output:
....1
...22
..333
.4444
55555
