/**
 * Created by LolHens on 20.01.2015.
 */
public aspect Aspect {
    after(): call(* *.test(..)) {
        Main.aspectj = true;

        int tmp2 = 1;
    }
}
