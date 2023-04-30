import random
size =  int(input("Размер массива:"))
newList = []
for i in range(0,size):
    newList.append(random.randint(-20,20))
min = int(input("Введите минимум:"))
max = int(input("Введите максимум:")) 
listResult = []
for j in newList:
        if(j>=min and j<=max):
            listResult.append(newList.index(j))
print(newList)
print(f"Индексы диапозона от {min} до {max} = {listResult}")