package oahu.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("harborview")
public class HarborviewProperties {

    private final Netfonds netfonds = new Netfonds();

    public Netfonds getNetfonds() {
        return netfonds;
    }

    public static class Netfonds {
        private String user;
        private String password;
        private boolean realtime;
        private boolean javascriptenabled;


        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public boolean isRealtime() {
            return realtime;
        }

        public void setRealtime(boolean realtime) {
            this.realtime = realtime;
        }

        public boolean isJavascriptenabled() {
            return javascriptenabled;
        }

        public void setJavascriptenabled(boolean javascriptenabled) {
            this.javascriptenabled = javascriptenabled;
        }
    }
}
