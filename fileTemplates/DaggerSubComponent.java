#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import dagger.MembersInjector;
import dagger.Subcomponent;

#parse("File Header.java")
@Subcomponent
public interface ${NAME} {

    MembersInjector<> getInjector();
}
