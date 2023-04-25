package Homework.lesson1.Product.Heir.Types;
//10. Туалетная бумага, содержащее следующее свойство:
//10.1 Количество слоёв

import Homework.lesson1.Product.Heir.HygieneItems;

public class ToiletPaper extends HygieneItems {
    private Integer layersNum;

    public ToiletPaper(String type, String name, Double price, Integer quantity, String unit, Integer piecesPerPack, Integer layersNum) {
        super(type, name, price, quantity, unit, piecesPerPack);
        this.layersNum = layersNum;
    }

    public Integer getLayersNum() {
        return layersNum;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Количество слоёв: " + layersNum + ";";
    }
}
