package org.example.HW1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Goods item1 = new Goods("высший Мука", 500, 1);
        Goods item2 = new Goods("Гречка", 250, 2);
        Goods item3 = new Goods("Рис высший", 400, 2);
        Goods item4 = new Goods("Кукуруза высший", 520, 1);
        Goods item5 = new Goods("Пшено высший", 220, 3);

        List<Goods> allGoods = new ArrayList<>();
        List<Goods> result = new ArrayList<>();

        allGoods.add(item1);
        allGoods.add(item2);
        allGoods.add(item3);
        allGoods.add(item4);
        allGoods.add(item5);

        for (Goods goods : allGoods) {
            if (strGoodsWord(goods.getName(), "высший") && intGradeNumber(goods.getGrade())) {
                result.add(goods);
            }
        }
        List<Integer> priceList = new ArrayList<>();
        for (int i = 0; i < result.size(); i++) {
            priceList.add(result.get(i).getPrice());
        }
        int max = 0;
        for (int i = 0; i < priceList.size(); i++) {
            if (priceList.get(i) > max) {
                max = priceList.get(i);
            }
        }
        System.out.println(max);
    }

    public static boolean strGoodsWord(String strName, String findWord) {
        strName.contains(findWord);
        return true;
    }

    public static boolean intGradeNumber(Integer intGrade) {
        if (intGrade == 1 || intGrade == 2) return true;
        return false;
    }
}

