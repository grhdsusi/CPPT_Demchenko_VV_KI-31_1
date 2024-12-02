import sys

rows_num= int(input("Введіть символ заповнювач: "))
lst=[]
filler= input("Введіть сивол заповнювач: ")
filler2 = input("Введіть другий символ заповнювач: ")

arr=[]
for i in range(rows_num):
    row = []
    for j in range(rows_num):
        if i + j < rows_num:
            row.append(filler)
        else:
            row.append(filler2)
            arr.append(row)
            
    print("Сформована матриця:")
for row in arr:
    print(" ".join(row))
