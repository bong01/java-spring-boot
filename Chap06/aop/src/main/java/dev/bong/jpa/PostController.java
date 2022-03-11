package dev.bong.jpa;

import com.google.gson.Gson;
import dev.bong.jpa.aspect.LogArguments;
import dev.bong.jpa.aspect.LogExecutionTime;
import dev.bong.jpa.aspect.LogReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
public class PostController {
    private static final Logger logger = LoggerFactory.getLogger(PostController.class);
    private final PostService postService;
//    private final Gson gson;

    public PostController(
            @Autowired PostService postService,
//            @Autowired GsonComponent gson
            @Autowired Gson gson
    ) {
        this.postService = postService;
//        this.gson = gson.getGson();
        logger.info(gson.toString());
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    @LogArguments
    public void createPost(
            @RequestBody PostDto dto
    ) {
        this.postService.createPost(dto);
    }

    @GetMapping("{id}")
    @LogReturn
    public PostDto readPost(
            @PathVariable("id") int id
    ) {
        return this.postService.readPost(id);
    }

    @GetMapping("")
    @LogExecutionTime
    public List<PostDto> readPostAll() {
        return this.postService.readPostAll();
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updatePost(
            @PathVariable("id") int id,
            @RequestBody PostDto dto
    ) {
        this.postService.updatePost(id, dto);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletePost(
            @PathVariable("id") int id
    ) {
        logger.info("deletePost, id: {}", id);
        this.postService.deletePost(id);
    }

    @GetMapping("test-log")
    public void testLog() {
        logger.trace("TRACE Log Message");
        logger.debug("DEBUG Log Message");
        logger.info("INFO Log Message");
        logger.warn("WARN Log Message");
        logger.error("ERROR Log Message");
    }
}
