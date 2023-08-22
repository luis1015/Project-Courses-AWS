package com.usuario.mcs.usuario.domain.usecase;

import com.usuario.mcs.usuario.domain.model.UserModel;
import com.usuario.mcs.usuario.domain.spi.IUserPersistencePort;

import java.util.List;
import java.util.Optional;

public class UserUseCase implements IUserPersistencePort {

    private final IUserPersistencePort userPersistencePort; // dependency injection point for contractor

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public void saveUser(UserModel usermodel) {
        userPersistencePort.saveUser(usermodel);
    }

    @Override
    public List<UserModel> getAllUsers() {
        return userPersistencePort.getAllUsers();
    }

    @Override
    public Optional<UserModel> getId(Long id) {
        return userPersistencePort.getId(id);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public UserModel updateUserModel(UserModel usermodel) {
        return null;
    }
}
