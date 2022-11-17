package employee;

public class Teacher extends Employee {
    @Override
    public void firstAid() {
        System.out.println("Мугалим биринчи жардам көрсөтөт");
    }

    @Override
    public void swim() {
        System.out.println("Мугалим сүзөт");
    }

    public void teaching(){
        System.out.println("Мугалим сабак берет");
    }

    @Override
    void say() {
        System.out.println("Мугалим сүйлөйт");
    }
}
