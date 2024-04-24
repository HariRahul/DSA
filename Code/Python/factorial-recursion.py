# Recursive function that returns the factorial of a number
def factorial(number):
    if number <= 1 :
        return 1
    else:
        return number * factorial(number-1)
    
result = factorial(4)
print(result)