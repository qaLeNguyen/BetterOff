package common;

public class Constant {

    public enum Credential {
        ADMIN("admin", "winmagic@123"),

        ;

        private final String username;
        private final String password;

        Credential(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }

    public enum URL {
        MESSO_ASIA("https://messo.asia"),
        MESSO_ONLINE("https://messo.online"),
        QAVN_ONLINE("https://qavn.online"),

        PROFILES("https://messo.asia/Profile/ViewProfiles"),
        USERS("https://messo.online"),
        PACKAGES("https://qavn.online");

        private final String url;

        URL(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }
    }

    public enum IdP {
        MESSO_ASIA("https://messo.asia:6500"),
        MESSO_ONLINE("https://messo.online:6500"),
        QAVN_ONLINE("https://qavn.online:6500");

        private final String url;

        IdP(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }
    }

}
