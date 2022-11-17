package employee;
/**
 *                     Task
 * HelpAble (method: void firstAid();), SwimAble (method: void swim();) деген интерфейтерди тузунуз.
 * Ал интерфейти implements кылган Employee деген abstract класс болсун.
 * Абстрак класстты мурастаган
 * Teacher ( void teaching();) жана Driver ( void driving();) класстары болсун.
 * Полиморфизм колдонуп 8 турдуу объект тузуп, ар бир тузгон объектте бардык методдорду чакырыныз.
 */
public class MainTest {
    public static void main(String[] args) {

        Employee employee = new Driver();
        employee.say();
        employee.swim();
        employee.firstAid();
        System.out.println("_______________________");


        HelpAble helpAble = new Driver();
        helpAble.firstAid();
        System.out.println("_______________________");


        SwimAble swimAble = new Driver();
        swimAble.swim();
        System.out.println("_______________________");


        Driver driver = new Driver();
        driver.driving();
        driver.say();
        driver.swim();
        driver.firstAid();
        System.out.println("_______________________");


        Employee employee1 = new Teacher();
        employee1.say();
        employee1.firstAid();
        employee1.swim();
        System.out.println("_______________________");


        HelpAble helpAble1 = new Teacher();
        helpAble1.firstAid();
        System.out.println("_______________________");


        SwimAble swimAble1 = new Teacher();
        swimAble1.swim();
        System.out.println("_______________________");


        Teacher teacher = new Teacher();
        teacher.teaching();
        teacher.say();
        teacher.firstAid();
        teacher.swim();
        System.out.println("_______________________");


    }
}
