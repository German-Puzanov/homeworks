package LabOOP3SecondTask.CHARACTER;

public interface Player {
    String getUserName();
    int damage(int baseDamage);
    boolean fight(Player player,int distance);
}
