// write code for c to add two number
#include <stdio.h>

int main() {
    double num1, num2, sum;

    // Input the two numbers
    printf("Enter first number: ");
    scanf("%lf", &num1);
    printf("Enter second number: ");
    scanf("%lf", &num2);

    // Add the numbers
    sum = num1 + num2;

    // Display the result
    printf("Sum = %.2lf\n", sum);

    return 0;
}

