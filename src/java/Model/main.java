package Model;

public class main {

    public static void main(String[] arg){
        Echipa e1 = new DevTeam("DevTeam",15);
        Echipa e2 = new HR("HR",5);
        Member m1 = new Member("Gica","Sapunaru",5,100,0);
        Member m2 = new Member("Andrei","Ghita",53,1230,2);
        Member m3 = new Member("Mihai","Stefan",34,2300,6);
        Member m4 = new Member("Mananc","Samantana",25,1430,2);
        Member m5 = new Member("Al","Capone",15,3700,8);
        Member m6 = new Member("GIX","HotWheels",52,1000,0);
        Member m7 = new Member("Bucataru","Manole",36,1630,3);
        Member m8 = new Member("NamNume","NamPrenume",24,2400,4);
        Member m9 = new Member("ALex","Sama",25,1340,6);
        Member m10 = new Member("Mircea","Spalatorul",29,3700,9);

        e1.addMember(m1);
        e1.addMember(m2);
        e1.addMember(m3);
        e1.addMember(m4);
        e1.addMember(m5);
        e2.addMember(m6);
        e2.addMember(m7);
        e2.addMember(m8);
        e2.addMember(m9);
        e2.addMember(m10);


        System.out.println(e1.setLeader(m1));
        System.out.println(e1.setLeader(m3));
        System.out.println(e2.setLeader(m7));
        System.out.println(e2.setLeader(m10));

        System.out.println(e1.getCost());
        System.out.println(e2.getCost());
        System.out.println(e1);
        System.out.println(e2);

        e1.removeMember((m4));
        e2.removeMember(m9);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1.getCost());
        System.out.println(e2.getCost());
    }

}
