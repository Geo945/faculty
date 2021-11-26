package Model;

public class HR extends Echipa{

    public HR(String team_name, Integer max_number_of_members) {
        super(team_name, max_number_of_members);
    }

    public double getCost() {
        double costs=0;
        for(Member m: members){
            if(m.equals(leader)){
                costs += 1350 + m.getYears_of_experience()*300;
            }else{
                costs += 1000;
                if(m.getYears_of_experience()>2 && m.getYears_of_experience()<5)
                    costs += 1000*0.25;
                if(m.getYears_of_experience()>5)
                    costs += 1000*0.5;
            }
        }
        return costs;
    }

}
