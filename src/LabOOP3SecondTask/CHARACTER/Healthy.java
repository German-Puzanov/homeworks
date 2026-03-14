package LabOOP3SecondTask.CHARACTER;

public interface Healthy {
    int MAX_HEALTH = 100;

    boolean isDied();
    void recoverHealth(int addedHealth);
}
