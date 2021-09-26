package com.fastcampus.jpa.bookmanager.domain;

import jdk.vm.ci.meta.Local;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jhlee
 * @since 2021/09/25
 */
class UserTest {
    @Test
    void Test() {
        User user = new User();
        user.setEmail("martin@fastcampus.com");
        user.setName("margin");
        user.setCreated_at(LocalDateTime.now());
        user.setUpdated_at(LocalDateTime.now());

        User user1 = new User(null, "martin", "martin@naver.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("martin", "martin@naver.com");

        User user3 = User.builder()
                .name("margin")
                .email("margin@fastcampus.com")
                .build();

        System.out.println(">>> " + user.toString());
        //System.out.println(">>> " + user1.toString());
        System.out.println(">>> " + user2.toString());
        System.out.println(">>> " + user3.toString());

    }
}