package pages;

public class Hooks {

    public class Hooks {

        private final ScenarioContext context;

        @Inject
        public Hooks(ScenarioContext context) {
            this.context = context;
        }

        @Before
        public void setup() {
            context.set("projectName", faker.company().name());
        }
    }
}
