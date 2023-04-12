coins = int(input("Введите кол-во монеток: "))
i = 0
countNull = 0
countSingle = 0
print(" 0 -  монетка в положении 'решка' \n 1 -  монетка в положении 'орел' ")
while i < coins:
    coins_position = int(input("Введите в каком положении находятся монетки: "))
    i += 1
    if coins_position == 0:
        countNull += 1
    if coins_position == 1:
        countSingle +=1

print(f" Кол-во монет в положении 'орел' :{countSingle} \n Кол-во монет в положении 'рещка' {countNull}")        

if(countNull > countSingle):
    print(f"Выгоднее перевернуть все монетки в положении 'орел':{countSingle} шт.")
else:
    print(f"Выгоднее перевернуть вск монетки в положении 'решка':{countNull} шт.")
if(countSingle == countNull):
    print(f"Монет в положении 'орел':{countSingle} и 'решка':{countNull} равное кол-во " )           
    