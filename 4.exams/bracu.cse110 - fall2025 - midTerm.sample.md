<div class="REY_ACADEMIA1">

### Courtasy of [`MOO-ORG`](https://github.com/MOO-ORG)
- Source: https://github.com/MOO-ORG/CSE110/blob/main/Extras/MID%20QS%20Practise/QS1.md
</br>
</br>
</br>
</br>
</br>

# Question 1 [CO1] [10 Points]

While wandering through the Amazon, you find a hidden temple. Inside is a treasure chest that requires solving a riddle. The chest asks for two numbers defining a range. Within that range there must be composite numbers, and the count of those composite numbers must be a factor of the absolute difference between the start and end values. You decide to write a Java program to test ranges before entering them.

Write a Java program that takes two integers (start and end) as input and counts how many composite numbers are in the inclusive range. Then:
- If the absolute difference between start and end is a multiple of the composite count, print: `Congratulations! The treasure is yours.`
- If it is not a multiple, print: `Close! But not quite.`
- If there are no composite numbers, print: `Too far off.`

## Sample Inputs & Outputs

| Sample Input                | Sample Output                                            | Explanation                                                                                              |
| :-------------------------- | :------------------------------------------------------- | :------------------------------------------------------------------------------------------------------- |
| **Start:** 8<br>**End:** 12 | `8 9 10 12`<br>`Congratulations! The treasure is yours.` | There are 4 composite numbers (8, 9, 10, 12). Absolute difference is 4; 4 is divisible by 4, so success. |
| **Start:** 5<br>**End:** 14 | `6 8 9 10 12 14`<br>`Close! But not quite.`              | There are 6 composite numbers. Absolute difference is 9; 9 is not divisible by 6, so not a success.      |
| **Start:** 1<br>**End:** 3  | `Too far off.`                                           | There are no composite numbers in this range.                                                            |

---

</br>
</br>
</br>
</br>
</br>









# Question 2 [CO1] [6 Points]
**Answer on the answer script**

Implement a Java program based on the following flowchart logic.

### Flowchart Logic
1. Start.
2. Prompt: `Current Balance:` → read `balance`.
3. Prompt: `Transaction Amount:` → read `transaction`.
4. If `transaction <= 0`:
     - Print: `Invalid Amount`
     - Terminate.
5. Else check `transaction <= balance`:
     - If false:
         - Print: `Insufficient Balance`
         - Terminate.
     - If true:
         - Update: `balance = balance - transaction`
         - Print: `Transaction Successful`
         - Print: `Current Balance: <updated balance>`
         - Terminate.

---

</br>
</br>
</br>
</br>
</br>









# Question 3 [CO4] [4 Points]
**Answer on the question paper**

The code below is intended to print an integer's digits from right to left, but it contains **5 errors**. Identify and correct them.

## Original Code (With Errors)
```java
1  import java.util.Scanner;
2  public class test
3  {
4      public static void main (String args)
5      {
6          Scanner scan = new Scanner (System);
7          int num = scan.nextInt();
8          int temp1 = '0';
9          while(num == 0)
10         {
11             temp1 = num / 10;
12             num /= 10;
13             System.out.print(temp1 + " ");
14         }
15     }
16 }
```

## Error Fixes (1 was given in question)

| Line | Corrected Code                           | Explanation                                 |
| :--- | :--------------------------------------- | :------------------------------------------ |
| 4    | `public static void main(String[] args)` | Missing array brackets for `args`.          |
|      |                                          |                                             |
|      |                                          |                                             |
|      |                                          |                                             |
|      |                                          |                                             |

---

</br>
</br>
</br>
</br>
</br>









# Question 4 [CO1] [5 Points]
**Answer on the question paper**

Trace the following code and illustrate the outputs. Show your workings on the answer script—answers without workings will not be accepted.

## Code to Trace

```java
public class QS4_Tracing {
    public static void main(String[] args) {
        int n1 = 184;
        int n2 = 24;
        int n3 = 56;
        while (!((n1 == n2) && (n2 == n3))) {
            if (n1 > n2) {
                if (n2 > n3) {
                    n1 -= n2;
                    System.out.println(n1);
                } else {
                    if (n1 > n3) {
                        n1 -= n3;
                        System.out.println(n1);
                    } else {
                        n3 -= n1;
                        System.out.println(n3);
                    }
                }
            } else {
                if (n2 > n3) {
                    if (n1 > n3) {
                        n2 -= n1;
                        System.out.println(n2);
                    } else {
                        n2 -= n3;
                        System.out.println(n2);
                    }
                } else {
                    n3 -= n2;
                    System.out.println(n3);
                }
            }
        }
        System.out.println(n1);
    }
}
```