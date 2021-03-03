package org.geektimes.projects.user.service;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.repository.DatabaseUserRepository;
import org.geektimes.projects.user.sql.DBConnectionManager;

import java.sql.SQLException;

public class UserServiceImp implements UserService{

    @Override
    public boolean register(User user){
        DBConnectionManager dbConnectionManager = null;
        try{
            dbConnectionManager = new DBConnectionManager();
        }catch (SQLException s){
            System.out.println("get db connect error !");
            return false;
        }
        DatabaseUserRepository databaseUserRepository = new DatabaseUserRepository(dbConnectionManager);
        boolean saveOk = databaseUserRepository.save(user);
        return saveOk;
    }

    @Override
    public boolean deregister(User user){
        return true;
    }

    @Override
    public boolean update(User user){
        return true;
    }

    @Override
    public User queryUserById(Long id){
        return null;
    }

    @Override
    public User queryUserByNameAndPassword(String name, String password){
        return null;
    }

}
