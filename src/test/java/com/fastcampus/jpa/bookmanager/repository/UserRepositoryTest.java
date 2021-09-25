package com.fastcampus.jpa.bookmanager.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//스프링 컨텍스트(여러 Bean을 다루는 공간) 로딩해서 테스트에 활용하겠다
@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {

    }
}