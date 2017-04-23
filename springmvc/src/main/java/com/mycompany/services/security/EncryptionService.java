package com.mycompany.services.security;

/**
 * Created by mohamedsultan on 06/04/2017.
 */
public interface EncryptionService {
    String encryptString(String input);
    boolean checkPassword(String plainPassword, String encryptedPassword);
}
