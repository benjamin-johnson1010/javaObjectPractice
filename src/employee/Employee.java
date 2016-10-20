/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author benjaminjohnson
 */

public class Employee {
    String name;
    public Employee(String empName){
    name = empName;
    }
    public String displayName(){
        return name;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Employee Ben = new Employee("Ben");
       String getName = Ben.displayName();
       System.out.println(getName);
        }
    }