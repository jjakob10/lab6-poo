import redeSocial.RedeSocial;
import redeSocial.User;

public class App {
    public static void main(String[] args) throws Exception {
        RedeSocial ufesbook = new RedeSocial();

        ufesbook.newUser(new User("Alan Texeira", 0));
        ufesbook.newUser(new User("Fulano de tal", 1));
        ufesbook.newUser(new User("Ciclano de tal", 2));
        ufesbook.newUser(new User("Beutrano de tal", 3));
        ufesbook.newUser(new User("Fulaninha", 4));
        ufesbook.newUser(new User("Johann", 5));

        User user1 = ufesbook.getUser(0);
        for (User user : ufesbook.getUsers()) {
            user1.addFreind(user);
        }

        ufesbook.removeUser(1);

        for (User user : ufesbook.getUsers()) {
            System.out.println("\nOs amigos de " + user.getNome() + " são:");
            for (User friend : user.getFriends()) {
                System.out.println("\t" + friend.getNome());
            }
        }

        // for (User friend : user1.getFriends()) {
        //     System.out.println(friend.getNome());
        // }

    }
}
