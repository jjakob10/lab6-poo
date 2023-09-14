import redeSocial.RedeSocial;
import redeSocial.User;
import vizualizaDot.Vizualiza;

public class App {
    public static void main(String[] args) throws Exception {
        RedeSocial ufesbook = new RedeSocial();

        User user1 = ufesbook.newUser("Alan Texeira");
        User fulano = ufesbook.newUser("Fulano de tal");
        User a = ufesbook.newUser("Ciclano de tal");
        User b = ufesbook.newUser("Beutrano de tal");
        ufesbook.newUser("Fulaninha");
        ufesbook.newUser("Johann");

        a.addFreind(b);
        b.addFreind(a);

        for (User user : ufesbook.getUsers()) {
            user1.addFreind(user);
        }

        ufesbook.removeUser(fulano);

        for (User user : ufesbook.getUsers()) {
            System.out.println("\nOs amigos de " + user.getNome() + " são:");
            for (User friend : user.getFriends()) {
                System.out.println("\t" + friend.getNome());
            }
        }

        Vizualiza v = new Vizualiza();
        v.criaVisualizacao(ufesbook);
        // for (User friend : user1.getFriends()) {
        // System.out.println(friend.getNome());
        // }

    }
}
