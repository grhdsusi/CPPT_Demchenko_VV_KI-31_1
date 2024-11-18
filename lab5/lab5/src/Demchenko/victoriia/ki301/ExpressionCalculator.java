package Demchenko.victoriia.ki301;

import java.io.*;

/**
 * Клас для обчислення виразу y = tan(x) / cot(x).
 * Використовується для демонстрації механізму виключень і запису результатів у файл.
 */
public class ExpressionCalculator {

    /**
     * Обчислює вираз y = tan(x) / cot(x).
     *
     * @param x значення змінної x
     * @return результат обчислення виразу
     * @throws IllegalArgumentException якщо x = 0, оскільки вираз не визначений
     */
    public double calculate(double x) throws IllegalArgumentException {
        if (x == 0) {
            throw new IllegalArgumentException("Значення x не може бути 0, оскільки вираз не визначений.");
        }
        var cotangent = Math.cos(x) / Math.sin(x);

        return Math.tan(x) / cotangent;
    }

    /**
     * Записує результат обчислення у текстовий файл.
     *
     * @param result результат обчислення
     * @param filePath шлях до файлу
     * @throws IOException якщо виникає помилка при записі у файл
     */
    public void writeResultToFile(double result, String filePath) throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter(filePath);
            writer.write("Результат обчислення: " + result);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    /**
     * Записує результат обчислення у двійковий файл.
     *
     * @param result результат обчислення
     * @param filePath шлях до двійкового файлу
     * @throws IOException якщо виникає помилка при записі у файл
     */
    public void writeResultToBinaryFile(double result, String filePath) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(filePath, "rw");
        try {

            raf.seek(raf.length());

            raf.writeDouble(result);
        } finally {
            raf.close();
        }
    }


    /**
     * Читає результат з двійкового файлу.
     *
     * @param filePath шлях до двійкового файлу
     * @return результат обчислення, зчитаний з файлу
     * @throws IOException якщо виникає помилка при читанні файлу
     */
    public double readResultFromBinaryFile(String filePath) throws IOException {
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream(filePath));
            return dis.readDouble();
        } finally {
            if (dis != null) {
                dis.close();
            }
        }
    }
}

