package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import javax.transaction.Transactional;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

//스프링 컨텍스트(여러 Bean을 다루는 공간) 로딩해서 테스트에 활용하겠다
@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void crud() {
        // insert 부분
//        userRepository.save(new User());
//        System.out.println(">>> " + userRepository.findAll());
//
//        userRepository.flush();
        //List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));

        //List<User> users = userRepository.findAllById(Lists.newArrayList(1L,3L,5L));

        //User user1 = new User("jack", "jack@fastcampus.co.kr");
        //User user2 = new User("steve", "steve@fastcampus.co.kr");
        //userRepository.saveAll(Lists.newArrayList(user1, user2));

        //List<User> users = userRepository.findAll();

        //users.forEach(System.out::println);
        
        // getOne()은 Object를 가져오고 findById()는 optional이라는 래핑된 객체를가져오는 것이 큰 차이
        //User user = userRepository.getOne(1L); // -- deprecated(2.5.x)-- no session error 발생 (@Transactional 추가)
        //Optional<User> user = userRepository.findById(1L);
        //User user = userRepository.findById(1L).orElse(null);
        //userRepository.save(new User("new_martin", "newmartin@fastcampus.com"));
        //userRepository.flush(); // db 반영시점 조절
        //userRepository.findAll().forEach(System.out::println);
        //System.out.println(">>> " + user);

        //long count = userRepository.count();
        //boolean exists = userRepository.existsById(1L);
        //userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
        //userRepository.findAll().forEach(System.out::println);
        //userRepository.deleteInBatch(); -- deprecated

        //paging 처리

//        Page<User> users = userRepository.findAll(PageRequest.of(0,3));
//
//        System.out.println("pages: " + users);
//        System.out.println("totalElements: " + users.getTotalElements());
//        System.out.println("totalPages: " + users.getTotalPages());
//        System.out.println("numberOfElements: " + users.getNumberOfElements());
//        System.out.println("sort: " + users.getSort());
//        System.out.println("size: " + users.getSize());
//
//        users.getContent().forEach(System.out::println);

//        ExampleMatcher matcher = ExampleMatcher.matching()
//                .withIgnorePaths("name")
//                .withMatcher("email", endsWith()); // email에 fastcampus.com로 끝나는것
//
//        Example<User> example = Example.of(new User("ma", "fastcampus.com"), matcher); // name: "ma"가 무시됨

        // 포함
        User user = new User();
        user.setEmail("slow");

        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("email", contains());
        Example<User> example = Example.of(user, matcher);
        userRepository.findAll(example).forEach(System.out::println);



    }
}