package MathBasic;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "трёх-звенный", "30000-футовый", "взаимный", "обоюдный выигрыш",
                "фронтенд", "на основе веб технологий", "проникающий", "умный", "шесть сигм", "метод критического пути", "динамичный"};

        String[] wordListTwo = {"уполномоченный","трудный","чистый продукт","ориентированный","центральный","распределённый","кластеризованный",
                "фирменный","нестандартный ум","позиционированный","сетевой","сфокусированный","использованный с выгодой",
                "выровненный","нацеленный на","общий","совместный","ускоренный"};
        String[] wordListThree = {"процесс","пункт разгрузки","выход из положения","тип структуры","талант","подход","уровень завоеванного внимания",
                "портал","период времени","обзор","образец","пункт следования"};

        int oneLenght = wordListOne.length;
        int twoLenght = wordListOne.length;
        int threeLenght= wordListThree.length;

        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Всё что нам нужно - это " + phrase);

    }
}
