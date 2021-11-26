package Model;

public class DevTeam extends Echipa{

    public DevTeam(String team_name, Integer max_number_of_members) {
        super(team_name, max_number_of_members);
    }

    public double getCost() {
        double costs=0;
        for(Member m: members){
            if(m.equals(leader)){
                costs += 2500 + m.getYears_of_experience()*250;
            }else{
                costs += 1500;
                if(m.getYears_of_experience()>2 && m.getYears_of_experience()<5)
                    costs += 1500*0.25;
                if(m.getYears_of_experience()>5)
                    costs += 1500*0.5;
            }
        }
        return costs;
    }
}
