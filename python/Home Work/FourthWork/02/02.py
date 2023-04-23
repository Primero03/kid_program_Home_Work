import random

size = int(input("Введите размер списка:"))
list = []
i = 0
while i < size:
    i+=1
    list.append(random.randint(0,10))
print(list)

sum = []
for k in range(len(list)):
    sum.append(list[k-2] + list[k-1] + list[k])

print(max(sum))