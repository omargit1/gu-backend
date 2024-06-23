package com.gestionusers.gu.service;

import com.gestionusers.gu.dto.UserDto;

import java.util.List;

public interface UserService {

  List<UserDto> findAll();
}
