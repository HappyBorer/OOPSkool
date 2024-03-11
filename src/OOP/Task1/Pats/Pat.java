package OOP.Task1.Pats;

public abstract class Pat {
    private String nickname;
    private int age;
    public Pat(){}
    public Pat(String nickname, int age){
        this.nickname = nickname;
        this.age = age;
    }

    @Override
    public String toString() {
        return nickname + ';' + age;
    }

    public abstract void getNoise();

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
