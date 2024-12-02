package Demchenko.Victoriaa.lab3;

import java.io.IOException;
/**
 * Клас House реалізує предметну область "Будинок" і містить методи для управління його складовими частинами.
 * Лабораторна робота №2.
 * Клас дозволяє працювати з дахом, дверима і вікнами будинку, а також веде лог діяльності.
 */
public abstract class House extends  Object{

    protected Door door;
    protected Window window;
    protected Logger logger;

    /**
     * Конструктор за замовчуванням, що створює будинок з типовими параметрами.
     *
     * @throws IOException якщо виникає помилка під час створення або роботи з лог-файлом.
     */
    public House() throws IOException {

        this.door = new Door("Розсувна", "Просте", false);
        this.window = new Window("Арочний", false);

        this.logger = new Logger("house_log.txt");

        logger.log(String.format("Будинок %s сторено.", this.toString()));
    }

    /**
     * Конструктор з параметрами для створення будинку з конкретними складовими частинами.
     *

     * @param door   об'єкт типу Door, що описує двері будинку.
     * @param window об'єкт типу Window, що описує вікна будинку.
     * @throws IOException якщо виникає помилка під час створення або роботи з лог-файлом.
     */
    public House( Door door, Window window) throws IOException, NoSuchMethodException {

        this.door = door;
        this.window = window;
        this.logger = new Logger("house_log.txt");

        logger.log(String.format("Будинок %s сторено.", this.toString()));
    }

    /**
     * Абстрактний метод для огляду будинку.
     *
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public abstract void inspectHouse() throws IOException;

    /**
     * Метод для відкриття вікна.
     *
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void openWindow() throws IOException {
        window.open();

        logger.log("Вікно відкрите.");
        System.out.println("Вікно відкрите.");
    }

    /**
     * Метод для закриття вікна.
     *
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void closeWindow() throws IOException {
        window.close();

        logger.log("Вікно закрите.");
        System.out.println("Вікно закрите.");
    }

    /**
     * Метод для відкриття дверей.
     *
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void openDoor() throws IOException {
        door.open();

        logger.log("Двері відкриті.");
        System.out.println("Двері відкриті.");
    }

    /**
     * Метод для закриття дверей.
     *
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void closeDoor() throws IOException {
        door.close();

        logger.log("Двері закриті.");
        System.out.println("Двері закриті.");
    }

    /**
     * Метод для зміни типу скла дверей.
     *
     * @param glassType новий тип скла для дверей.
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void changeDoorGlass(String glassType) throws IOException {
        door.setGlassType(glassType);

        logger.log(String.format("Тип скла в дверей було змінено на '%s'", glassType));
        System.out.printf("Тип скла в дверей було змінено на '%s'\n", glassType);
    }

    /**
     * Метод для зміни типу вікна.
     *
     * @param windowType новий тип вікна.
     * @throws IOException якщо виникає помилка під час запису у лог-файл.
     */
    public void changeWindowType(String windowType) throws IOException {
        window.setType(windowType);

        logger.log(String.format("Тип вікна було змінено на %s", windowType));
        System.out.printf("Тип вікна було змінено на %s\n", windowType);
    }


    public void closeLogger() throws IOException {
        logger.close();
    }

    /**
     * Метод для виведення інформації про будинок у форматі рядка.
     *
     * @return рядок, що представляє об'єкт будинку.
     */
    @Override
    public String toString() {
        return "House{" +

                ", door=" + door +
                ", window=" + window +
                ", logger=" + logger +
                '}';
    }
}


