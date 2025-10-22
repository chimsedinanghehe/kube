package backend.controller;

import backend.entity.Post;
import backend.repo.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {

    private final PostRepository repo;

    public PostController(PostRepository repo) {
        this.repo = repo;
    }

    // Hiển thị trang index
    @GetMapping("/")
    public String home(Model model) {
        List<Post> posts = repo.findAll();
        model.addAttribute("posts", posts);
        model.addAttribute("newPost", new Post());
        return "index";
    }

    // Thêm post mới
    @PostMapping("/posts")
    public String addPost(@ModelAttribute("newPost") Post post) {
        repo.save(post);
        return "redirect:/";
    }
}
