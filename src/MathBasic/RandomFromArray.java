package MathBasic;
/*
*
*  Задача:
* Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
* Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом,
* с учётом его веса.

* Пример:
* Дан массив [1, 2, 3], и массив весов [1, 2, 10].
*/


public class RandomFromArray {
    Item[] result;

    public RandomFromArray(int[] numbers, int[] weights) {
        this.result = Item.generator(numbers, weights);
    }

    public Item GetRandom() {
        int i = (int) (Math.random() * result.length);
        System.out.println(result[i].number + " " + result[i].weight);
        return result[i];
    }
}


class Item {
    int number;
    int weight;

    public Item(int number, int weight) {
        this.number = number;
        this.weight = weight;
    }

    public static Item[] generator(int[] numbers, int[] weights) {
        Item[] items = new Item[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            items[i] = new Item(numbers[i], weights[i]);
        }
        return items;

    }
}

class Itemtest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int[] weight = {31, 22, 13, 45};
        RandomFromArray testarray = new RandomFromArray(numbers, weight);
        testarray.GetRandom();
        testarray.GetRandom();
        testarray.GetRandom();
        testarray.GetRandom();
    }
}