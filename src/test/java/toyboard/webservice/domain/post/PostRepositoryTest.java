package toyboard.webservice.domain.post;


import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import toyboard.demo.webservice.domain.Post.Post;
import toyboard.demo.webservice.domain.Post.PostRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;


    @After("")
    public void cleanup() {
        postRepository.deleteAll();
    }
    @Test
    public void call() {
        //given

        postRepository.save(Post.builder());
    }

}
