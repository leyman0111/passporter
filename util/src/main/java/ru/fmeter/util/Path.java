package ru.fmeter.util;

public class Path {
    public final static String MANUAL = "/manual";

    public static class AuthPath {
        public final static String MAIN = MANUAL + "/auth";

        public final static String LOGIN = MAIN + "/login";

        public final static String LOGOUT = MAIN + "/logout";
    }

    public static class TemplatePath {
        public final static String MAIN = MANUAL + "/templates";

        public final static String ALL = MAIN + "/all";

        public final static String NEW = MAIN + "/new";

        public final static String VALIDATION = MAIN + "/validation";
    }
}
