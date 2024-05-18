package inheritance;
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    
    // Constructors, getters, setters, and common methods
}

class Manager extends Employee {
    private int teamSize;

    // Additional attributes, methods specific to Manager
}

class Engineer extends Employee {
    private String techStack;

    // Additional attributes, methods specific to Engineer
}

class SalesPerson extends Employee {
    private double salesTarget;

    // Additional attributes, methods specific to SalesPerson
}
