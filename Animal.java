class Animal {
    
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
    public void walk(){
        System.out.println("Animal is walking");
    }
    
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound(); 
        myCat.makeSound();
        Person James = new Person();
        James.walkDog();
    }
}