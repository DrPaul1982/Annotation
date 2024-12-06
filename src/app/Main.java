package app;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        ArrayUtils arrayUtils = new ArrayUtils();
        Method[] methods = arrayUtils.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Author.class)) {
                Author author = method.getAnnotation(Author.class);
                System.out.println("Check is annotation for AuthorInfo is present.\n");
                try {
                    method.invoke(arrayUtils, author.firstName(), author.secondName());
                    if (!"Roger".equals(author.firstName()) || !"Zelazny".equals(author.secondName())) {
                        System.out.println("Something wrong with author name.\n");
                    } else {
                        System.out.println("Author name is correct.\n");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                System.out.println("Check is annotation for MethodInfoPrint is present.\n");
                try {
                    method.invoke(arrayUtils, methodInfo.methodName(), methodInfo.methodType(), methodInfo.methodDescription());
                    if (!"MethodInfoPrint".equals(methodInfo.methodName()) || !"void".equals(methodInfo.methodType())
                            || !"Some information about the method".equals(methodInfo.methodDescription())) {
                        System.out.println("Something wrong with method information for MethodInfoPrint.\n");
                    } else {
                        System.out.println("Method information for MethodInfoPrint is correct.\n");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
