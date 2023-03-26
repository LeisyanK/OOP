package org.example.seminar5.cw.service;

import org.example.seminar5.cw.model.User;

public interface UserService {
    void save(User user);
    boolean credit(User user, int creditSum);
}
