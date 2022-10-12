public class VendingMachine {
    public VendingMachine( int tot_lattine , int tot_gettoni)
    {
        tot_lattine=50;
        tot_gettoni = 0;
    }
    public int inserimentoGettone( int tot_gettoni)
    {

            int  newtot_gettoni = tot_gettoni+1;
                    return newtot_gettoni;



    }
    public int rimozioneLattina (int tot_lattine)
    {
        int new_totlattine = tot_lattine -1;
            return new_totlattine;
    }


}
