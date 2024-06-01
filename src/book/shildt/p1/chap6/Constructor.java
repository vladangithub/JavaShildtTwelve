package book.shildt.p1.chap6;

/* Здесь в Вох используется конструктор для инициализации размеров коробки .
* /
 */

public class Constructor {
    public static void main(String[] args) {

    }
}

class  Box {
    double width;
    double height;
    double depth;

    //Это конструктор для BOX

    Box(){
        System.out.println("Конструирование Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // Вычислить и возвратить объем

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo6 {
    public static void main(String[] args) {
        // Объявить, разместить в памяти и инициализировать объекты Box.
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;
        // Получить объем первой коробки.
        vol = mybox1.volume();
        System.out.println("Объем первой коробки равен: " + vol);

        // Получить объем второй коробки.
        vol = mybox2.volume();
        System.out.println("Объем второй коробки равен: " + vol);
    }
}

