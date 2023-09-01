package task_one;

public class CheckCredentials {
    static boolean checkCredentials(String login, String password, String confirmPassword) {
        boolean conf = password.equals(confirmPassword);
        int llen = login.length();
        int plen = password.length();

        if (llen >= 20)
            throw new WrongLoginException(llen);
        else if (plen < 20 || !conf)
            throw new WrongPasswordException(plen, conf);
        else
            return true;
    }

}
