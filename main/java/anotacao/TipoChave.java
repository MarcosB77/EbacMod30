package anotacao;

import java.lang.annotation.*;

/**
 * FuturoDevMarcos
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
