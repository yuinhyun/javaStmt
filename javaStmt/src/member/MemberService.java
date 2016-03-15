package member;

public interface MemberService {
	public void join(MemberBean member);
	public MemberBean login(String id, String password);
	public MemberBean detail(String id, String password);
	public MemberBean update(MemberBean member);
	public MemberBean remove(String id);
	
}
