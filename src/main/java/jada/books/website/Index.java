package jada.books.website;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

    @RequestMapping("/a")
    String index() {
        return "Hello Academy!";
    }

}
