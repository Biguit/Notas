
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucca
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double N1, N2, NE, MD, ME;
        
    Scanner enter= new Scanner (System.in);
    System.out.println ("Informe a nota 1: ");
    N1= enter.nextDouble();
    System.out.println ("Informe a nota 2: ");
    N2= enter.nextDouble();
    MD = (N1 + N2) / 2;
    System.out.println ("A média do aluno é: "+ MD);
    
    if (MD >= 7)
   
        System.out.println ("O aluno foi aprovado!");
    
    else
    
        System.out.println ("Digite sua nota do Exame: ");
        NE= enter.nextDouble();
        ME = (N1 + N2 + NE) / 3;
        System.out.println ("Sua média do exame foi: "+ ME);
        
        
            if (ME >= 5)
            {
                System.out.println ("O aluno foi aprovado em Exame!");
            }

            else
            {
                System.out.println ("O Aluno foi reprovado!");
            }
        // TODO code application logic here
    
    
}
