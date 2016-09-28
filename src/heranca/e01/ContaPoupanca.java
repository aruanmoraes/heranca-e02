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
public class ContaPoupanca extends Conta {
    public void atualiza(double x){
        System.out.println("Porcentagem de Atualização: "+(x*3)+"%");
        saldo=(((x/100)*saldo)*3)+saldo;
    }
}
