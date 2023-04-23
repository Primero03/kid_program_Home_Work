num1 = int(input("Первое число:"))
num2 = int(input("Второе число:"))

def GetSum(num_1,num_2):
    if num_1 == 0:return
    GetSum(num_1 = num_1 -1,num_2 = num_2 + 1)
    print(num_2+1)


GetSum(num1,num2)

## Нахождение суммы двух введенных чисел