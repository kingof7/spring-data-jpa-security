package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

//spring data jpa 라이브러리가 자바 인터페이스를 지원해줌
public interface UserRepository extends JpaRepository<User, Long> { // <Entity Type, PK의 타입>

}
