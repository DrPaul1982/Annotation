package app;

public class ArrayUtils {

    @Author(firstName = "Roger", secondName = "Zelazny")
    public void AuthorInfo(String firstName, String secondName) {
        System.out.println("Author: " + firstName + " " + secondName + "\n");
    }

    @MethodInfo(methodName = "MethodInfoPrint", methodType = "void", methodDescription = "Some information about the method")
    public void MethodInfoPrint(String methodName, String methodType, String methodDescription) {
        System.out.println("Method name: " + methodName +
                "\nMethod type: " + methodType +
                "\nMethod description: " + methodDescription + "\n");
    }
}
