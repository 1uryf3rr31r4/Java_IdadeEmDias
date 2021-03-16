package idadedias;

import java.util.Scanner;

public class IdadeDias
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int anos, meses, dias;
        
        System.out.print("Indique a idade: ");
        anos = input.nextInt();
        
        System.out.print("Indique a meses: ");
        meses = input.nextInt();
        
        System.out.print("Indique a dias: ");
        dias = input.nextInt();
        
        dias = (anos * 365) + (meses * 30) + dias;
        
        System.out.print("Sua idade em dias é "+dias);
    }
    
}
