package demob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemocController {
    @GetMapping("/c")
    public String methodC() {
        return " -> Service c";
    }
}
