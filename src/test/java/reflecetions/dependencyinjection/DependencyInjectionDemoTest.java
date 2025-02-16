package reflecetions.dependencyinjection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DependencyInjectionDemoTest {

    @Test
    void testDependencyInjection() throws Exception {
        Client client = new Client();
        DIContainer.injectDependencies(client);

        // Check if the 'service' field in Client is correctly injected
        assertNotNull(client.service, "Service should be injected");
    }
}
