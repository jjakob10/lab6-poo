package redeSocial;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class RedeSocial {
    private Map<Integer, User> users = new HashMap<Integer, User>();
    private int proxId;

    public Set<User> getUsers() {
        return new HashSet<User>(users.values());
    }

    public User getUser(int uid) {
        return users.get(uid);
    }

    public User newUser(String nome) {
        User u = new User(nome, proxId++);
        users.put(u.getUid(), u);
        return u;
    }

    public void removeUser(User friend) {
        users.remove(friend.getUid());
        for (User user : users.values()) {
            user.removeFriend(friend);
        }
    }

}
