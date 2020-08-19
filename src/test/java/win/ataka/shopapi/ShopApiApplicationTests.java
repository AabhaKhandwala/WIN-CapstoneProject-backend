package win.ataka.shopapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import org.springframework.boot.test.context.SpringBootTest;

import win.ataka.shopapi.entity.ProductInfo;
import win.ataka.shopapi.entity.User;

@SpringBootTest
public class ShopApiApplicationTests {
    @Test
    public void UserInfoTests() {
        User john = new User(1L, "John@email.com", "password", "John", "1234567890", "123 address", true,
                "ROLE_CUSTOMER");
        assertEquals("John", john.getName());
        assertEquals("123 address", john.getAddress());
        assertEquals("password", john.getPassword());
        assertNotNull(john.getEmail());
    }

    @Test
    public void ProductInfoTests() {
        ProductInfo p1 = new ProductInfo("1", "Carrots", null, "Locally grown carrots");
        assertEquals("Carrots", p1.getProductName());
        assertNull(p1.getProductStock());
        assertNotNull(p1.getProductDescription());
        assertNotEquals("locally grown carrots", p1.getProductDescription());
    }
}
