import by.teachmeskills.kaymovich.homework13.IntList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа через запятую: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new IllegalArgumentException("Введите число.");
        }

        String[] number = input.split(",");
        int[] numbers = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            numbers[i] = Integer.parseInt(number[i]);
        }
        IntList intList = new IntList(numbers);
        do {
            System.out.println("""
                     Задача № 1. Метод  toString(). Он возвращает строковое представление списка в квадратных скобках через запятую.
                     Задача № 2. Метод int get(). Он принимает индекс в списке и возвращает элемент. 
                     Задача № 3. Метод int set(). Он присваивает новое значение элементу списка на заданном индексе.
                     Задача № 4. Метод int size(). Он возвращает текущую длину списка.
                     Задача № 5. Метод void add(). Он добавляет элемент в конец списка.
                     Задача № 6. Метод int remove(). Он удаляет элемент с заданным индексом.
                     Задача № 7. Метод IntList subList Он возвращает новый объект IntList, который является подсписком исходного от заданного индекса.
                     Задача № 8. Метод int lastIndexOf(). Он ищет последнее вхождение заданного элемента в списке.
                     Задача № 9. Метод void sort(). Он сортирует элементы в списке по возрастанию с помощью алгоритма bubble sort.
                     
                     Введите '0' что бы выйти из программы.
                    """);

            int task = scanner.nextInt();

            switch (task) {
                case 1 -> System.out.print(intList);
                case 2 -> {
                    scanner = new Scanner(System.in);
                    System.out.print("Введите индекс элемента. ");
                    int element = scanner.nextInt();
                    System.out.println(intList.get(element));
                }
                case 3 -> {
                    scanner = new Scanner(System.in);
                    System.out.print("Введите  индекс. ");
                    int position = scanner.nextInt();
                    System.out.print("Введите элемент. ");
                    int element = scanner.nextInt();
                    System.out.println(intList.set(position, element) + "----" + element + "\n");
                }
                case 4 -> System.out.println(intList.size());
                case 5 -> {
                    scanner = new Scanner(System.in);
                    System.out.print("Введите элемент. ");
                    int element = scanner.nextInt();
                    intList.add(element);
                    System.out.println(intList);
                }
                case 6 -> {
                    scanner = new Scanner(System.in);
                    System.out.print("Введите индекс элементя, для его удаления. ");
                    int position = scanner.nextInt();
                    System.out.println(intList.remove(position) + "  Элемент удален.");
                    System.out.println(intList);
                }
                case 7 -> {

                    scanner = new Scanner(System.in);
                    System.out.print("Введите начало границы. ");
                    int leftBound = Integer.parseInt(scanner.nextLine());
                    System.out.print("Введите конец границы. ");
                    int rightBound = scanner.nextInt();
                    System.out.println(intList.subList(leftBound, rightBound));
                    System.out.println(intList.subList(leftBound));
                }
                case 8 -> {
                    scanner = new Scanner(System.in);
                    System.out.print("Введите элемент. ");
                    int element = scanner.nextInt();
                    System.out.println(intList.lastIndexOf(element));
                }
                case 9 -> {
                    intList.sort();
                    System.out.println();
                }
                case 0 -> {
                    System.out.println("Выход из программы.");
                    return;
                }
                default -> System.out.println("Ошибка.");
            }
        } while (true);
    }
}