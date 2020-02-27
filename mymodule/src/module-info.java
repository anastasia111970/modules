module mymodule {

    exports com.tsconsulting.modules.hello;
    provides com.tsconsulting.modules.hello.Welcomer with com.tsconsulting.modules.hello.impl.WelcomerImpl;
    opens com.tsconsulting.modules.hello;

}
