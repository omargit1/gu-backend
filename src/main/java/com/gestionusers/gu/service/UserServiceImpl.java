package com.gestionusers.gu.service;

import com.gestionusers.gu.dto.UserDto;
import com.gestionusers.gu.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements  UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserDto> findAll() {
        return userRepository.findUsers().stream().map(u -> new UserDto(u.getId(), u.getName(), u.getAge())).collect(Collectors.toList());
    }
}
