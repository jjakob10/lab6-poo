package vizualizaDot;

import redeSocial.RedeSocial;
import redeSocial.User;

public class Vizualiza {

    public void criaVisualizacao(RedeSocial r) {
        System.out.println("digraph G {");
        for (User user : r.getUsers()) {
            for (User friend : user.getFriends()) {
                System.out.println("\t\""+user.getNome() + "\"->\"" + friend.getNome()+"\"");
            }
        }
        System.out.println("}");
    }
}
