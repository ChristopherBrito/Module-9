class Person {
private Dog dog;


    public Person() {
        dog = new Dog();
    }
    public void walkDog() {
        dog.walk();
        System.out.println("Dog is walking");
    }
    
}