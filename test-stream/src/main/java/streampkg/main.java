package streampkg;

import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Animal> animals = getAnimals();

        // Старый подход (Императивный)
        List<Animal> predatorsOld = new ArrayList<>();
        for (Animal animal: animals) {
            if (animal.getClassification().equals(Classification.PREDATOR)) {
                predatorsOld.add(animal);
            }
        }
//        predators.forEach(System.out::println);
        // Новый подход (Декларативный)

        // Filter
        List<Animal> predatorsFilter = animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .collect(Collectors.toList());
//        predatorsFilter.forEach(System.out::println);
        List<Animal> ageFilter = animals.stream()
                        .filter(animal -> animal.getAge() > 15)
                        .collect(Collectors.toList());
//        ageFilter.forEach(System.out::println);
        // Sort
        List<Animal> sorted = animals.stream()
                .sorted(Comparator.comparing(Animal::getAge)    // внутри sorted можно накидывать условия
                    .thenComparing(Animal::getClassification)   // через thenComparing
                    .reversed())                                // обратная сортировка
                .collect(Collectors.toList());
//        sorted.forEach(System.out::println);
        // All match
        boolean allMatch = animals.stream()
                .allMatch(animal -> animal.getAge()>0); // всем животным > 0 - это true
//        System.out.println();
        // Any match
        boolean anyMatch = animals.stream()
                .anyMatch(animal -> animal.getAge()>120); // хотя бы одному больше 120 - это true
//        System.out.println(anyMatch);
        // None match (ничего не нашли - вернем true, иначе false)
        boolean noneMatch = animals.stream()
                .noneMatch(animal -> animal.getName().equals("Слон"));
//        System.out.println(noneMatch);
        // Max (ищет максимальное значение)
//        animals.stream()
//                .max(Comparator.comparing(Animal::getAge))
//                .ifPresent(System.out::println);
        // Min (ищет минимальное значение)
//        animals.stream()
//                .min(Comparator.comparing(Animal::getAge))
//                .ifPresent(System.out::println);
        // Group (в IDE начинаем через animals заполнять группировку, затем на поле collect выделяем и выбрать подсказку)
//        Map<Classification, List<Animal>> classificationListMap = animals.stream()
//                .collect(Collectors.groupingBy(Animal::getClassification));
//        classificationListMap.forEach((classification, animals1) -> {
//            System.out.println(classification);
//            animals1.forEach(System.out::println);
//            System.out.println();
//        });
//        Map<Classification, List<Animal>> classificationListMap = animals.stream()
//                .sorted(Comparator.comparing(Animal::getAge))                       // а так можно добавить еще и сортировку внутри сгруппированных элементов
//                .collect(Collectors.groupingBy(Animal::getClassification));
//        classificationListMap.forEach((classification, animals1) -> {
//            System.out.println(classification);
//            animals1.forEach(System.out::println);
//            System.out.println();
//        });
        // самый старый хищник (сначала фильтр по классу PREDATOR, затем ищем максимум возраста,
        // затем через map получаем имя. Результат будет Optional<String>, выводим через ifPresent
//        Optional<String> oldPredator = animals.stream()
//                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
//                .max(Comparator.comparing(Animal::getAge))
//                .map(Animal::getName);
//        oldPredator.ifPresent(System.out::println);
    }
    private static List<Animal> getAnimals() {
        return List.of(
                new Animal("Слон", 20, Classification.HERBIVONE),
                new Animal("Лев", 10, Classification.PREDATOR),
                new Animal("Гиена", 11, Classification.PREDATOR),
                new Animal("Жираф", 7, Classification.HERBIVONE),
                new Animal("Гибон", 35, Classification.OMNIVOROUS),
                new Animal("Лошадь", 36, Classification.HERBIVONE),
                new Animal("Рысь", 2, Classification.PREDATOR),
                new Animal("Динозавр", 200, Classification.PREDATOR)
        );
    }
}
