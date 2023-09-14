package redeSocial;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class User {
    private String nome;
    private int uid;
    private Set<User> friends = new HashSet<User>();

    public User(String nome, int uid) {
        this.nome = nome;
        this.uid = uid;
    }

    public String getNome() {
        return nome;
    }

    public int getUid() {
        return uid;
    }

    public Set<User> getFriends() {
        return new HashSet<User>(friends);
    }

    public boolean isFriend(User friend) {
        
        return friends.contains(friend);
    }

    public void addFreind(User friend) {
        if (friend.getUid() != this.uid)
            friends.add(friend);
    }

    public void removeFriend(User friend) {
        friends.remove(friend);
    }

}
