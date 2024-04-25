package kr.ac.kopo.guestbook2024.repository;

import kr.ac.kopo.guestbook2024.entity.Guestbook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class GuestbookRepositoryTest {

    @Autowired
    private GuestbookRepository guestbookRepository;

    @Test
    public void insertDummies(){
        IntStream.rangeClosed(1, 300).forEach(i ->{
            Guestbook guestbook = Guestbook.builder()
                    .title("Title====" + i)
                    .content("Content====" + i)
                    .writer("Writer====" + (i % 10))
                    .build();
            guestbookRepository.save(guestbook);
        });
    }

}
