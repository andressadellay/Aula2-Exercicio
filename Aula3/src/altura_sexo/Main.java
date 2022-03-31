
package altura_sexo;

import java.util.Scanner;

/**
 *
 * @author Andressa
 */
public class Main {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Scanner ler = new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            //verifica se é a primeira altura
            if(i==0){
               System.out.println("Informe a primeira altura:");
               p.setAltura(ler.nextDouble());
               p.setMenorAltura(p.getAltura());
            }//fim se
            p.verificarMaiorAltura();
            p.verificarMenorAltura();
            
            System.out.println("Informe sexo: 1- Masculino | 2 - Feminino");
            p.setSexo(ler.nextInt());
            if(p.getSexo()==1){
                p.setQtdHomens(p.getQtdHomens()+1);
            }else if(p.getSexo()==2){
                p.somarAlturaMulheres();
                p.setQtdMulheres(p.getQtdMulheres()+1);
            }
            System.out.println("Informe altura:");
            p.setAltura(ler.nextDouble());
            
        }
        System.out.println("Maior altura guardada: "+p.getMaiorAltura());
        System.out.println("Sexo da pessoa mais alta: "+p.getSexoMaiorAltura());
        System.out.println("Média da altura das mulheres: "+p.calcularMediaAlturaMulheres());
        System.out.println("Quantidade de homens informados: "+p.getQtdHomens());
    }
    
}
