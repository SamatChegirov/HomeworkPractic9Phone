/*1.1 Создайте класс Phone с полями( brand, version, screen, memory, price)
создайте getter and setter и конструктор с 3-мя аргументами,
создайте 2 объекта этого класса,
дайте значения 3-м полям класса через конструктор, а двум через getter.*/
public class Main {
    public static void main(String[] args) {


        Phone phone1 = new Phone("RedMi", "Note", 6.5);
        System.out.println("Brand: " + phone1.getBrand() + "\n" + "Version: " + phone1.getVersion() + "\n" + "Size inch: " + phone1.getScreen());

        Phone phone2 = new Phone();
        phone2.setMemory(512);
        phone2.setPrice(35000);
        System.out.println("Memory: " + phone2.getMemory() + "\n" + "Price: " + phone2.getPrice());
    }
}