package basic.final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("id", "name");
        System.out.println(member);
        member.changeData("id2", "name2");
        System.out.println(member);
    }
}
