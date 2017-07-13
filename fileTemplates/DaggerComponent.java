#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import dagger.MembersInjector;
import dagger.Component;

#parse("File Header.java")
@Component
public interface ${NAME} {

    MembersInjector<> getInjector();
}
