package basic.construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("member1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("member2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for ( MemberConstruct member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적:" + member.grade);
        }

    }
}
