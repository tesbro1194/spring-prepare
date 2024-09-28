package com.sparta.springprepare;

import lombok.*;

// Lombok : 자바 프로젝트를 진행하는데 거의 필수적으로 필요한 메서드/생성자 등을 자동 생성해줌으로써 코드를 절약할 수 있도록 도와주는 라이브러리
// 아래와 같은 annotation 이후 Gradle -> build -> build
@Getter  // lombok 에 모든 속성 Getter 메서드 생성
@Setter  // lombok 에 모든 속성 Setter 메서드 생성
@RequiredArgsConstructor // lombok 에 final 키워드가 붙은 필드를 매개 변수로 하는 생성자 메서드 만듦.
@AllArgsConstructor // lombok 에 모든 필드를 매개 변수로 하는 생성자 메서드 만듦.
@NoArgsConstructor // lombok 에 기본 생성자 메서드 만듦.
public class Memo {
    private String username;
    private String contents;


}