
package zad_prog_rozdz_7_zad_2;

import javax.swing.JOptionPane;

/**
 * Payroll
 * @author Magdalena
 */
public class Zad_prog_rozdz_7_zad_2 {

    public static void main(String[] args) {
        
        final int EMPLOYEES = 7;
        
        int[] employeeHours = new int[EMPLOYEES];
        
        double[] employeePayRate = new double[EMPLOYEES];
        
        getValues1(employeeHours);
        
        getValues2(employeePayRate);
                
        Payroll pr = new Payroll(employeeHours, employeePayRate);
        
        int[] employees = pr.getEmployeeId();
        
        pr.updateWages();
        
        String result = "Id pracownika       Pensja brutto\n";
        
        for (int x : employees){
            
            result += "    " + x + "                      " + pr.unitWages(x)+ "\n";
        }
        
        JOptionPane.showMessageDialog(null, result);
    }
    
    private static void getValues1(int[] array1) {
        
        for (int i = 0; i < array1.length; i++) {
            
            array1[i] = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę przepracowanych godzin pracownika nr " + (i + 1) + ":"));
            
            while(array1[i] < 0) {
                
                array1[i] = Integer.parseInt(JOptionPane.showInputDialog("Błędne dane wejściowe. Podaj liczbę przepracowanych godzin pracownika nr " + (i + 1) + " (liczba większa od 0):"));
            }
        }
    }
    
    private static void getValues2(double[] array2) {
        
        for (int i = 0; i < array2.length; i++) {
            
            array2[i] = Double.parseDouble(JOptionPane.showInputDialog("Podaj stawkę godzinową pracownika nr " + (i + 1) + ":"));
            
            while(array2[i] < 13.70) {
                
                array2[i] = Double.parseDouble(JOptionPane.showInputDialog("Błędne dane wejściowe. Podaj stawkę godzinową pracownika nr " + (i + 1) + " (stawka większa od 13.70 pln/h):"));
            }
        }
    }
}
