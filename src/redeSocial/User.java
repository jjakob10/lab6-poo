package redeSocial;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class User {
    private String nome;
    private int uid;
    private Map<Integer, User> friends = new HashMap<Integer, User>();

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
        return new HashSet<User>(friends.values());
    }

    public User getFriend(int friendId) {
        return friends.get(friendId);
    }

    public boolean isFriend(int friendId) {
        return getFriend(friendId) != null;
    }

    public void addFreind(User friend) {
        if (friend.getUid() != this.uid)
            friends.put(friend.getUid(), friend);
    }

    public void removeFriend(int friendId) {
        friends.remove(friendId);
    }

}
