package utilpack;

import java.lang.annotation.*;

@Target(ElementType.METHOD)

@Retention(RetentionPolicy.RUNTIME)

public @interface yearsLived {
	int byear();
	int age();
}
