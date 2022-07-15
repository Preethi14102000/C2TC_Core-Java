package com.cg.constructors;

public class constructorexample1 {

	public static void main(String[] args) {
		class Employee {
		    int id;
		    String name;
		    float salary;
		    Employee() {
		        System.out.println("user defined no-argument "
		        + "constructor executed");
		    }
		    void display() {
		        System.out.println(id + " " + name + " " + salary);
		    }
		}
		 {
		        
		        Employee e1 = new Employee();
		        Employee e2 = new Employee();
		        
		        e1.display();
		        e2.display();  
		       
		    } 


	}

}
