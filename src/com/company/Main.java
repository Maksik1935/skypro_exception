package com.company;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println(testMethod("zzzzzzzz", "aaaaa", "aaaaa"));
    }

    public static boolean testMethod(String login, String password, String confirmPassword) {
        try {
            if (!Pattern.matches("[A-z0-9_]+", login) || login.length() > 20) {
                throw new WrongLoginException();
            } else if (!Pattern.matches("[A-z0-9_]+", password) || password.length() > 20
                    || !password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }
        }catch (WrongLoginException e) {
            return false;
        } catch (WrongPasswordException e) {
            return false;
        }
        return true;

    }
}
