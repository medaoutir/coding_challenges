package simplePath;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SimplePath {

    public String simplifyPath(String path) {
        String canonicalPath = "";
        Stack<String> fileStack = new Stack<>();
        List<String> files = Arrays.stream(path.split("/")).filter(((Predicate<String>) String::isEmpty).negate()).collect(Collectors.toList());
        files.stream().forEach(file -> {
            if (!fileStack.isEmpty() && "..".equals(file)) {
                fileStack.pop();
            } else if (!Arrays.asList("..",".", "/").contains(file)) {
                fileStack.push(file);
            }
        });
        Enumeration<String> fileEnum = fileStack.elements();
        if (!fileEnum.hasMoreElements())
            canonicalPath = "/";
        else {
            while (fileEnum.hasMoreElements()) {
                canonicalPath += "/" + fileEnum.nextElement();
            }
        }
        return canonicalPath;
    }

}
