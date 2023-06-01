package algorithms.general;

import java.util.*;

public class AbsolutePath {
    // /usr/mware/../visa/
    public String execute(String path){
        StringBuilder result = new StringBuilder();
        result.insert(0, "/") ;
        Queue<String> dirs = Collections.asLifoQueue(new ArrayDeque<>());
        dirs.addAll(Arrays.asList(path.split("/")));
        while(!dirs.isEmpty()){
            String dir = dirs.poll();
            if("..".equals(dir)){
                dirs.poll();
                continue;
            }
            if(".".equals(dir) || dir.isEmpty()){
                continue;
            }
            result.insert(1, dir.concat("/"));
        }
        System.out.println(result.toString());
        return result.toString();
    }
}
