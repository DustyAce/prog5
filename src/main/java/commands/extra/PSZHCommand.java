package commands.extra;

import commands.Command;

/**
 * ПСЖ
 */
public class PSZHCommand implements Command {
    @Override
    public String desc() {
        return "ПСЖ";
    }

    /**
     * ПСЖ
     */
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
