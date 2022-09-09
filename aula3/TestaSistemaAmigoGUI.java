package aula3;
import javax.swing.JOptionPane;

public class TestaSistemaAmigoGUI {
    public static void main(String[] args) throws Exception {
        SistemaAmigo sis = new SistemaAmigo();
        int numeroMensagens = Integer.parseInt(JOptionPane.showInputDialog("Número máximo de mensagens"));
        int numeroAmigos = Integer.parseInt(JOptionPane.showInputDialog("Número máximo de amigos"));
        String[][] dataAmigos = new String[numeroAmigos][numeroAmigos];
        for (int i = 0; i < dataAmigos.length; i++) {
            String nome = JOptionPane.showInputDialog("Nome amigo");
            String email = JOptionPane.showInputDialog("Email amigo");
            dataAmigos[i][0] = nome;
            dataAmigos[i][1] = email;
            sis.cadastraAmigo(nome, email);
        }

        String amigo = JOptionPane.showInputDialog("Amigo cadastrado");
        String amigoSorteado = JOptionPane.showInputDialog("Amigo sorteado");
        sis.configuraAmigoSecretoDe(amigo, amigoSorteado);
        sis.enviaMensagemParaTodos("Oi, mandando", dataAmigos[0][0], true);

    }
}
