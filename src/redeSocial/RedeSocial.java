package redeSocial;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;


public class RedeSocial {
    private Map<Integer, User> users = new HashMap<Integer, User>();

    public Set<User> getUsers() {
        return new HashSet<User>(users.values());
    }

    public User getUser(int uid) {
        return users.get(uid);
    }

    public void newUser(User user) {
        users.put(user.getUid(),user);
    }

    public void removeUser(int uid){
        users.remove(uid);
        for(User user : users.values()){
            user.removeFriend(uid);
        }
    }

}
