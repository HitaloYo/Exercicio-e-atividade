package Atividade1.Q4;

import Atividade1.Q1.*;
import Atividade1.Q2.*;
import Atividade1.Q3.*;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        System.out.println("  ");
        
        // A
        AssAdministrativo assAdm = new AssAdministrativo("Junim", "Pi20240309", "Noite", 100);
        AssTecnico assTec = new AssTecnico("Cleiton", "Pi20230408", 100);
        System.out.println(assAdm.toString());
        System.out.println(assTec.toString());
        
        // B
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite 1 para Ingresso Normal ou 2 para Ingresso VIP:");
        int tipoIngresso = scanner.nextInt();

        Ingresso ingresso;
            
            if (tipoIngresso == 1) {
                ingresso = new Normal(100.00);
                ingresso.exibeValor();
                System.out.println(ingresso.exibeValor());
            } else if (tipoIngresso == 2) {
                System.out.println("Digite 1 para Camarote Superior ou 2 para Camarote Inferior:");
                int tipoCamarote = scanner.nextInt();
    
                if (tipoCamarote == 1) {
                    ingresso = new CamaroteSuperior(100.00, 50.00);
                    System.out.println(ingresso.exibeValor());
                    System.out.println("Ingresso VIP Camarote Superior");
                } else if (tipoCamarote == 2) {
                    ingresso = new CamaroteInferior(100.00, 30.00, "Setor B");
                    System.out.println(ingresso.toString());
                    System.out.println("Ingresso VIP Camarote Inferior");
                } else {
                    System.out.println("Opção inválida.");
                    return;
                }
            } else {
                System.out.println("Opção inválida.");
                return;
            }


            System.out.println("Escolha um Imovel \nVelho - 1\nNovo - 2\n");
            int tipo = scanner.nextInt(); 
            if (tipo == 1) {
                Velho imoVelho = new Velho("Centro sul", 5000, 1500);
                System.out.println(imoVelho.toString());
            
            } else if (tipo == 2) {
                Novo imoNovo = new Novo("Centro norte", 5000, 1500);
                System.out.println(imoNovo.toString());
            
        }
          
        } catch (Exception e) {
            System.err.println("Argumento invalido");
        }





    }
    
    
    
        
}
