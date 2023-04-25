package Homework.lesson1.Product;

//*Реализовать класс товар, содержащий следующие свойства:
//1. Название
//2. Цена
//3. Количество
//4. Единица измерения
//А так же реализовать следующие классы-наследники:
//1. Продукты питания, содержащие следующие свойства:
//2. Напитки, содержащие следующие свойства:
//3. Предметы гигиены, содержащие следующие свойства:
//4. Детские товары:
//А так же реализовать слеюущие классы, наследуемые от приведённых выше классов(надеюсь сами разберётесь от каких именно):
//5. Молоко, содержащиее следующее свойство:
//5.1 Процент жирности
//5.2 Срок годности
//6. Лимонад
//7. Хлеб, содержащий следующие свойство:
//7.1 Тип муки
//8. Яйца, содержащее следующиее свойство:
//8.1 Количество в упаковке
//9. Маски
//10. Туалетная бумага, содержащее следующее свойство:
//10.1 Количество слоёв
//11. Подгузники, содержащие следующее свойства:
//11.1 Размер
//11.2 Минимальный вес
//11.3 Максимальный вес
//11.4 Тип
//12. Соска
//У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы, в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, принемающие все поля.
//Реализовать в классе Program, метод выводящий все данные о товаре. Создать в Main все объекты товаров и проверить работу метода, созданного в классе Program
public class Product {
    private String type;
    private String name;
    private Double price;
    private Integer quantity;
    private String unit;

    public Product(String type, String name, Double price, Integer quantity, String unit) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }

    public String getName() {
        return name;
    }
    public void  setName(String name){
        this.name=name;
    }

    public Double getPrice() {
        return this.price;
    }
    public void setPrice(Double price){
        this.price=price;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity=quantity;
    }

    public String getUnit() {
        return this.unit;
    }
    public void setUnit(String unit){
        this.unit=unit;
    }


    @Override
    public String toString() {
        return String.format("\n%s : %s;\n Цена: %s руб;\n Количество: %s;\n Единица измерения: %s;",
                type,
                name,
                price,
                quantity,
                unit);
    }
}
