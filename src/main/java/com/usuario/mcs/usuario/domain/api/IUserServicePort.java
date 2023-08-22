package com.usuario.mcs.usuario.domain.api;

import com.usuario.mcs.usuario.domain.model.UserModel;

import java.util.List;
import java.util.Optional;

public interface IUserServicePort {

    void saveUser(UserModel usermodel);

    List<UserModel> getAllUsers();

    Optional<UserModel> getId(Long id);

    void deleteById(Long id);

    UserModel updateUserModel(UserModel usermodel);

}
