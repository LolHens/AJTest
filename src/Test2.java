import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by LolHens on 21.01.2015.
 */
@Aspect
public class Test2 {
    @AfterReturning("call(* *.test(..))")
    public void after() {
        Main.atAspectj = true;

        int tmp3 = 1;
    }
}
