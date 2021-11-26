package Model;

import java.util.ArrayList;

public abstract class Echipa {
    private String team_name;
    private Integer max_number_of_members;
    private Member leader;
    private ArrayList<Member> members = new ArrayList<>();
    private Integer leader_cost;
    private Integer member_cost;
    private Integer experience_cost;

    public Echipa(String team_name, Integer max_number_of_members, Integer leader_cost, Integer member_cost, Integer experience_cost) {
        this.team_name = team_name;
        this.max_number_of_members = max_number_of_members;
        this.leader_cost=leader_cost;
        this.member_cost=member_cost;
        this.experience_cost=experience_cost;
    }

    public boolean addMember(Member m){
        if(members.size()<max_number_of_members) {
            members.add(m);
            return true;
        }
        return false;
    }

    public boolean setLeader(Member newLeader) {
        if(!members.contains(newLeader))
            return false;
        if(newLeader.getYears_of_experience()>5){
            this.leader=newLeader;
            return true;
        }
        return false;
    }

    public Member removeMember(Member removeMember){
        for(Member m: members){
            if(m.equals(removeMember)){
                Member ret = m;
                members.remove(m);
                return ret;
            }
        }
        return null;
    }

    public String toString(){
        String tmp = "Team leader: ";
        tmp += leader.getFirstName() + leader.getLastName() + ", Members:\n";
        for(Member m: members){
            tmp += m.toString() + "\n";
        }
        return tmp;
    }

    public void setTeam_name(String team_name, Member m) {
        if(leader.equals(m)) {
            this.team_name = team_name;
        }else{
            System.out.println("You are not the leader !");
        }
    }

    public void setMax_number_of_members(Integer max_number_of_members, Member m) {
        if(leader.equals(m)) {
            this.max_number_of_members = max_number_of_members;
        }else{
            System.out.println("You are not the leader !");
        }
    }

    //nu am facut metoda abstracta pt ca e 95% identica implementarea, difera doar niste numere
    //asa ca am metoda si in DevTeam si HR setez costurile pt. tipu de echipa.
    //+ ca nici nu mai trb sa pun 2 membri protected ca sa o implementez in subclase.
    public double getCost() {
        double costs=0;
        for(Member m: members){
            if(m.equals(leader)){
                costs += leader_cost + m.getYears_of_experience()*experience_cost;
            }else{
                costs += member_cost;
                if(m.getYears_of_experience()>2 && m.getYears_of_experience()<5)
                    costs += member_cost*0.25;
                if(m.getYears_of_experience()>5)
                    costs += member_cost*0.5;
            }
        }
        return costs;
    }
}
