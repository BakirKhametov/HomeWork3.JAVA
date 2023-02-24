package org.example.HW2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LowPrice item1 = new LowPrice("Пшеница", "Канада", 100, 8500, 1);
        LowPrice item2 = new LowPrice("Помидоры", "Турция", 300, 1500, 3);
        LowPrice item3 = new LowPrice("Апельсины", "Испания", 200, 4500, 2);
        LowPrice item4 = new LowPrice("Арбузы", "Азербайджан", 700, 8500, 3);
        LowPrice item5 = new LowPrice("Рис", "Китай", 800, 7500, 1);
        LowPrice item6 = new LowPrice("Кофе", "Бразилия", 600, 9500, 1);

        List<LowPrice> allItems = new ArrayList<>();

        allItems.add(item1);
        allItems.add(item2);
        allItems.add(item3);
        allItems.add(item4);
        allItems.add(item5);
        allItems.add(item6);


        System.out.print("Search grade: ");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        sc.close();
        List<LowPrice> newAllItems = new ArrayList<>();
        for (LowPrice allItem : allItems) {
            if (searchGrade((allItem.getGrade()), grade)) {
                newAllItems.add(allItem);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < newAllItems.size(); i++) {
            if (newAllItems.get(i).getPrice() > newAllItems.get(i + 1).getPrice()) {
                result.clear();
                result.add(newAllItems.toString());
            }
        }
        System.out.println(result);
    }

    public static boolean searchGrade(Integer intGrade, int grade) {
        if (intGrade.equals(grade)) return true;
        return false;
    }
}

