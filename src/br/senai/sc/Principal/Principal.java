/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.Principal;

import br.senai.sc.sisGestao.modelo.CadastrarTarefa;
import br.senai.sc.sistemaGestao.JFrames.LoginJFrame;

public class Principal {

    public static void main(String[] args) {
        LoginJFrame login = new LoginJFrame();
        login.setVisible(true);
        
        CadastrarTarefa ct = new CadastrarTarefa();
        ct.getData();
    }
}
