package app;

import javax.swing.*;
import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        ArrayList<String> nome = new ArrayList<>();
        ArrayList<String> senha = new ArrayList<>();
        boolean autentica;
        int menu;
        do { menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Entrar\n" +
                "2 - Cadastrar\n" +
                "3 - Remover\n" +
                "4 - Sair"));
            switch (menu){
                case 1:
                    autentica = false;
                    String entrarNome = JOptionPane.showInputDialog("Digite o seu nome:");
                    String entrarSenha = JOptionPane.showInputDialog("Digite o sua senha:");
                    for (int i = 0; i < nome.size() ; i++) {
                        if (entrarNome.equals(nome.get(i)) && entrarSenha.equals(senha.get(i))){
                            autentica = true;
                            break;
                        }
                    }
                    if (autentica){
                        JOptionPane.showMessageDialog(null,"Bem vindo, " + entrarNome + " !");
                    } else {
                        JOptionPane.showMessageDialog(null,"Tente novamente!");
                    }
                    break;
                case 2:
                    autentica = true;
                    String cadastrarNome = JOptionPane.showInputDialog("Digite o seu nome:");
                    String cadastrarSenha = JOptionPane.showInputDialog("Digite o sua senha:");
                    for (int i = 0; i < nome.size() ; i++) {
                        if (cadastrarNome.equals(nome.get(i))){
                            autentica = false;
                            JOptionPane.showMessageDialog(null,"Usuario já cadastrado ! Tente novamente.");
                            break;
                        }
                    }
                    if (autentica){
                        nome.add(cadastrarNome);
                        senha.add(cadastrarSenha);
                        JOptionPane.showMessageDialog(null,"Cadastro realizado ! Bem vindo, " + cadastrarNome + " !");
                    }
                    System.out.println(nome.toString() + " " + senha.toString());
                    break;
                case 3:
                    autentica = false;
                    String removerNome = JOptionPane.showInputDialog("Digite o nome a ser removido:");
                    for (int i = 0; i < nome.size() ; i++) {
                        if (removerNome.equals(nome.get(i))){}
                        autentica = true;
                        break;
                    }
                    if(autentica){
                        nome.remove(removerNome);
                        JOptionPane.showMessageDialog(null,"Nome removido! ");
                    } else{
                        JOptionPane.showMessageDialog(null,"Nome não encontrado para ser removido! Tente novamente. ");
                    }
                    System.out.println(nome.toString() + " " + senha.toString());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Você saiu !");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Escolha uma opção válida !");
                    break;
            }
        }while(menu != 4);





    }
}
