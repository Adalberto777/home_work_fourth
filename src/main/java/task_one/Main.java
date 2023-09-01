package task_one;

import static task_one.CheckCredentials.checkCredentials;

public class Main {
    public static void main(String[] args) {
        String[][] credentials = {
                {"ivan", "1i2v3a4n5i6v7a8n91011", "1i2v3a4n5i6v7a8n91011"}, //correct
                {"1i2v3a4n5i6v7a8n91011", "", ""}, //wrong login length
                {"ivan", "1i2v3a4n5i6v7a8n91011", "1i2v3a4n5"}, //confirm mismatch
                {"ivan", "1i2v3a4n5", "1i2v3a4n5"},//wrong password length
                {"ivan", "1i2v3a4n5", "1i"} //wrong password length and confirm mismatch
                };
        for (int i = 0; i < credentials.length; i++) {
            try {
                System.out.println(checkCredentials(credentials[i][0], credentials[i][1],credentials[i][2]));
                } catch (WrongLoginException e) {
                e.printStackTrace();
                } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
                }
            }
        }
}
