class Animal {
    String name;
    int age;
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}

class Bird extends Animal {
    void makeSound() {
        System.out.println("Tweet!");
    }
}
