numS = int(input("Введите сумму двех чисел: "))
numP = int(input("Введите произведение двух чисел: "))

numX = int(1)
numY = int(1)

while(numX+numY<numS):
    numX += 1
    numY = numX -1
   
while(numY*numX != numP):
    numY+=1
    numX-=1


print(numY,numX)        

