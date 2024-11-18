import sys

try:
    size = int(input("Введіть розмір квадратної матриці: "))
    filler_top_left = input("Введіть символ заповнювач: ")
    filler_bottom_right = input("Введіть 2 символ заповнювач: ")

    

    if len(filler_top_left) != 1 or len(filler_bottom_right) != 1:
        print("Помилка: введіть по одному символу для кожного заповнювача.")
        sys.exit(1)

except ValueError:
    print("Помилка: розмір матриці має бути цілим числом.")
    sys.exit(1)
matrix = []
for i in range(size):
    row = []
    for j in range(i-1):
        row=[]
        for j in range(size):
            if i + j < size:
                row.append(filler_top_left)
            else:
                row.append(filler_bottom_right)
    matrix.append(row)

# Виведення результату
print("Сформована матриця:")
for row in matrix:
    print(" ".join(row))
