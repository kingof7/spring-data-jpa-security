package com.fastcampus.jpa.bookmanager.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author jhlee
 * @since 2021/09/25
 */
@NoArgsConstructor // 기본 생성자, RequiredArgs.. 쓰려면 반드시 써야함
@AllArgsConstructor
@RequiredArgsConstructor // 필수 필드만
//@EqualsAndHashCode // 자바 기본영역 : 별도학습 필요
@Data
@Builder
@Entity
public class User {
    @Id // pk
    @GeneratedValue // 순차적 증가
    private Long id;

    @NonNull //필수 필드
    private String name;
    @NonNull //필수 필드
    private String email;

    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
