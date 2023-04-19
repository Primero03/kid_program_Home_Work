

import random
size = int(input("Введите размер массива:"))
num = int(input("Искомое число:"))
array = []
count = 0
for i in range(size):
    array.append(random.randint(0,10))
    if(num == array[i]):
       count+=1
       
print(array)
print(count)