a = int(input("Введите первое число в массиве:"))
n = int(input("Введите шаг:"))
d = int(input("Введите размер массива:"))

list = []
for i in range(d):
    print(a + i * n)