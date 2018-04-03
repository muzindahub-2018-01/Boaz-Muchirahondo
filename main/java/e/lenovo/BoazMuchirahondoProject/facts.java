package e.lenovo.BoazMuchirahondoProject;

/**
 * Created by Lenovo on 30/3/2018.
 */

public class facts {
    String Facts[] = {"Zimbabwe is the home of the Victoria falls sharing it with Zambia ","Zimbabwe gained its independence on 18 april 1980," +
            "Zimbabwe is a landlocked country ","over 5 million dollars worth of currency is exchanged in Mbare everyday ","Zimbabwe has 16 official languages ",
    "Zimbabwe has only had 3 Presidents since archiving its independence in 1980","Zimbabwe is a former British Colony ","Emmerson Mnangagwa is the current President of Zimbabwe ",
    "it has a Population of over 16 million people "};

    int i=0;

    public String nextFact()

    {
        i++;

        return Facts[i];

    }

}
