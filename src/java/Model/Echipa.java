package Model;

import java.util.ArrayList;

public abstract class Echipa {
    private String team_name;
    private Integer max_number_of_members;
    protected Member leader;
    protected ArrayList<Member> members = new ArrayList<>();


    public Echipa(String team_name, Integer max_number_of_members) {
        this.team_name = team_name;
        this.max_number_of_members = max_number_of_members;
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


    public abstract double getCost();
}
