#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import com.dough.boule.BouleObject;
import com.dough.boule.ChangeEvent;
import com.dough.boule.Key;

#parse("File Header.java")
public class ${NAME} extends BouleObject {

    public static enum Property implements Key {
    }
}
