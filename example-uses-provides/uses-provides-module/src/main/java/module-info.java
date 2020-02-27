import com.tsconsulting.module.usesprovides.Welcomer;
import com.tsconsulting.module.usesprovides.impl.WelcomerImpl;

module mymodule {

    exports com.tsconsulting.module.usesprovides;
    provides Welcomer with WelcomerImpl;
    opens com.tsconsulting.module.usesprovides;

}
