package otto.odin.backenddemo.features.demo.infrastructure.driven.adapters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import otto.odin.backenddemo.core.infrastructure.driving.ApiVersionPrefixController;

@RestController
@ApiVersionPrefixController
public class DemoRestApiAdapter {
    @GetMapping("/demo")
    public String checkDemo() {
        return "It's a demo";
    }
}
