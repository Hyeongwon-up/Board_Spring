package toyboard.demo.webservice.domain.Post;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity // 테이블과 링크될 클래스임을 나타낸다, 언더스코어 네이밍으로 이름을 매칭한다 = SalesManger.java <-> sales_manager table
public class Post {

    @Id // 테이블의 PK
    @GeneratedValue(strategy = GenerationType.AUTO) // PK 의 생성규칙 , 자동증가하는 auto increment
    private Long id;

    @Column(length =500,nullable = false) // 테이블의 컬럼을 나타내며, 굳이 선언하지 않더라도 해당 클래스의 필드는 모두 컬럼이 된다,
    private String title;

    @Column(columnDefinition = "Text", nullable = false)
    private String content;

    private String author;

    public Post(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
