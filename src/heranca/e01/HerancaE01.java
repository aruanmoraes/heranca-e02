/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca.e01;

/**
 *
 * @author a1552058
 */
public class HerancaE01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
       //CONTA
        c.deposita(150);
        System.out.println("");
        c.saca(50);
        System.out.println("");
        c.atualiza(10);
        System.out.println("");
        System.out.print("Saldo: ");
        c.getSaldo();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //CONTA CORRENTE
        cc.deposita(150);
        System.out.println("");
        cc.saca(50);
        System.out.println("");
        cc.atualiza(10);
        System.out.println("");
        System.out.print("Saldo: ");
        cc.getSaldo();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        //CONTA POUPANÇA
        cp.deposita(150);
        System.out.println("");
        cp.saca(50);
        System.out.println("");
        cp.atualiza(10);
        System.out.println("");
        System.out.print("Saldo: ");
        cp.getSaldo();
        System.out.println("");
        System.out.println("");
    }
    
}
