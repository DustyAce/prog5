package commands;

import com.sun.jdi.ClassNotPreparedException;

public class PSZHCommand implements Command{
    @Override
    public String desc() {
        return "ПСЖ";
    }

    @Override
    public void execute(String... args) {
        System.out.println(
                """
                        ##########      ########    ##  ##  ##
                        ##########     #########    ##  ##  ##
                        ##      ##    ####           ## ## ##\s
                        ##      ##    ###             ###### \s
                        ##      ##    ###            ########\s
                        ##      ##    ####           ## ## ##\s
                        ##      ##     #########    ### ## ###
                        ##      ##       #######    ##  ##  ##""");

    }


}
