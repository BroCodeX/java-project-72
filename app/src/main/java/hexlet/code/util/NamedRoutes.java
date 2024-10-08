package hexlet.code.util;

public class NamedRoutes {

    public static String rootPath() {
        return "/";
    }

    public static String urlsPath() {
        return "/urls";
    }

    public static String urlPath(Long id) {
        return urlPath(String.valueOf(id));
    }

    public static String urlPath(String id) {
        return String.format("/urls/%s", id);
    }

    public static String checksPath(String id) {
        return urlPath(id) + "/checks";
    }

    public static String checksPath(Long id) {
        return checksPath(String.valueOf(id));
    }
}
