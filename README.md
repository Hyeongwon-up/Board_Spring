# 게시판[Springboot]


***

### - 개발환경
      - IntelliJ
      - JAVA 15
      - Gradle
      - MySQL
### - 라이브러리
      - JPA
      - Thymeleaf 
      - Lombok
      - LiveReload
      

[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#introducing-thymeleaf){:target="_blank"}
      
***
## update

application.properties -> application.yml 사용!



***
 ## remember
 
 Lombok 라이브러리 Annotation 
    - @NoArgsConstructor : 기본 생성자 자동 추가
        - access = AccessLevel.PROTECTED : 기본생성자의 접근 권한을 protected로 제한
        - 생성자로 protected Posts() {}와 같은 효과
        - Entity 클래스를 프로젝트 코드상에서 기본생성자로 생성하는 것은 막되, JPA에서 Entity 클래스를 생성하는것은 허용하기 위해 추가
    - @Getter : 클래스내 모든 필드의 Getter 메소드를 자동생성.
    - @Builder : 해당 클래스의 빌더패스 클래스를 생성.
        - 생성자 상단에 선언시 생성자에 포함된 필드만 빌더에 포함한다.
