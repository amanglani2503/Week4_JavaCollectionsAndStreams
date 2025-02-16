package reflecetions.dependencyinjection;

public class DependencyInjectionDemo {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        DIContainer.injectDependencies(client);
        client.run();
    }
}