import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.Point;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(2, 7);
        Point p4 = new Point(3, 5);
        Point p5 = new Point(1, 4);
        Point p6 = new Point(3, 2);
        Point p7 = new Point(6, 1);

        Character[] characters = { new Peasant(p1), new Bandit(p2), new Sniper(p3), new Crossbowman(p4),
                new Spearman(p5),
                new Magician(p6), new Monk(p7) };

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(4);
            list1.add(characters[index]);
        }

        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(4) + 3;
            list2.add(characters[index]);
        }

        // объединяем два списка в один
        List<Character> allCharacters = new ArrayList<>();
        allCharacters.addAll(list1);
        allCharacters.addAll(list2);

        // сортируем список персонажей по скорости
        allCharacters.sort((c1, c2) -> c2.getSpeed() - c1.getSpeed());

        // выводим информацию обо всех персонажах
        for (Character character : allCharacters) {
            System.out.println(character.getDescription());

        }

    }
}