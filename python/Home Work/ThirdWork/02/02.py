import random
size = int(input("Введите размер массива:"))
num = int(input("Искомое число:"))
array = []
count = 0
result = 30
for i in range(size):
    array.append(random.randint(0,10))
   
for i in array:
    if(i == num):
        result = i
        print(f"{result} число")
        break
    else:
        print(i)
        count = i - num
        if(count<0):
          count *=count
        if(count < result):
         result = i  

print(array)  
print(f"{result} число")         