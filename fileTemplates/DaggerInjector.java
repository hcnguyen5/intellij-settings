#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import dagger.MembersInjector;

#parse("File Header.java")
public interface ${NAME} {

    MembersInjector<> getInjector();
}
