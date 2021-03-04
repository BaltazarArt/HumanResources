/*
Reyes Baltazar Baltazar
2022705
 */
package mx.edu.cesba.main;
//psvm 
//sout 

import javax.swing.JOptionPane;
import mx.edu.cesba.model.Employee;

/**
 *
 * @author reyes
 */
public class HR_Main {
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID"));
        e1.firstName=JOptionPane.showInputDialog("Ingrese nombre");
        e1.lastName=JOptionPane.showInputDialog("Ingrese apellido");
        e1.age=Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
        e1.email=JOptionPane.showInputDialog("Ingrese correo");
        e1.phoneNumber=Integer.parseInt(JOptionPane.showInputDialog("Ingrese num telefono"));
        e1.salary= Double.parseDouble(JOptionPane.showInputDialog("Ingrese salario"));
        e1.hiredate=JOptionPane.showInputDialog("Ingrese fecha de contratacion");
        
        e2.id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID"));
        e2.firstName=JOptionPane.showInputDialog("Ingrese nombre");
        e2.lastName=JOptionPane.showInputDialog("Ingrese apellido");
        e2.age=Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
        e2.email=JOptionPane.showInputDialog("Ingrese correo");;
        e2.phoneNumber=Integer.parseInt(JOptionPane.showInputDialog("Ingrese num telefono"));
        e2.salary= Double.parseDouble(JOptionPane.showInputDialog("Ingrese salario"));
        e2.hiredate=JOptionPane.showInputDialog("Ingrese fecha de contratacion");
        
        e1.getDetails();
        System.out.println("___");
        e2.getDetails();
    }
}
