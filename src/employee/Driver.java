package employee;

public  class Driver extends Employee {
    @Override
    public void firstAid() {
        System.out.println("Айдоочу биринчи жардам көрсөтөт");
    }

    @Override
    public void swim() {
        System.out.println("Айдоочу сүзөт");
    }

    public void driving(){
        System.out.println("Айдоочу машина айдайт");
    }

    @Override
    void say() {
        System.out.println("Айдоочу сүйлөйт");
    }
}
