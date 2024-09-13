package object.z_type;

import org.openqa.selenium.By;

public enum LocatorsType {
    ID {
        @Override
        public By buildBy(String locator) {
            return By.id(locator);
        }
    },
    NAME {
        @Override
        public By buildBy(String locator) {
            return By.name(locator);
        }
    },
    XPATH {
        @Override
        public By buildBy(String locator) {
            return By.xpath(locator);
        }
    },
    CSS {
        @Override
        public By buildBy(String locator) {
            return By.cssSelector(locator);
        }
    };

    public abstract By buildBy(String locator);
}