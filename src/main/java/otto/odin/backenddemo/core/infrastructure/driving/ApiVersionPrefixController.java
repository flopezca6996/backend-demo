package otto.odin.backenddemo.core.infrastructure.driving;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@RequestMapping("/${apiVersion}/")
public @interface ApiVersionPrefixController {
    @AliasFor(annotation = Component.class)
    String value() default "v1";
}