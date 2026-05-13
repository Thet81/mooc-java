// Member.java
import java.util.*;
public class Member implements Comparable<Member> {

	public static void main(String[] args) {
		List<Member> member = new ArrayList<>();
		member.add(new Member("mikael",182));
		member.add(new Member("matti",187));
		member.add(new Member("ada",184));

		member.stream().forEach(m -> System.out.println(m));
		System.out.println();
		member.stream().sorted().forEach(m-> System.out.println(m));
		member.stream().forEach(m -> System.out.println(m));
		System.out.println();
		Collections.sort(member);
		member.stream().forEach(m -> System.out.println(m));
	}
	private String name;
	private int height;

	public Member(String name,int height){
		this.name = name;
		this.height = height;
	}

	public String getName(){
		return this.name;
	}

	public int getHeight(){
		return this.height;
	}

	@Override
	public String toString(){
		return this.getName() + "( " + this.getHeight() + " )";
	}

	@Override
	public int compareTo(Member member){
		if(this.height == member.height){
			return 0;
		}else if (this.height > member.height){
			return 1;
		}else {
			return -1;
		}
	}
}

