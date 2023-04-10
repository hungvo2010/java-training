public class TestOverrideInterface implements Person, Named {

    @Override
    public String getName() {
        return Person.super.getName();
    }

}
