import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        Character[] characters = { new Peasant(), new Bandit(), new Sniper(), new Crossbowman(), new Spearman(),
                new Magician(), new Monk() };

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