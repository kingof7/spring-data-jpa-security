package com.fastcampus.jpa.bookmanager.domain;

import lombok.*;

import java.time.LocalDateTime;

/**
 * @author jhlee
 * @since 2021/09/25
 */
@NoArgsConstructor // 기본 생성자, RequiredArgs.. 쓰려면 반드시 써야함
@RequiredArgsConstructor // 필수 필드만
@AllArgsConstructor
@EqualsAndHashCode // 자바 기본영역 : 별도학습 필요
@Data
@Builder
public class User {
    @NonNull //필수 필드
    private String name;
    @NonNull //필수 필드
    private String email;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
