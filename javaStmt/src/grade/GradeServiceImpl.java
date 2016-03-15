package grade;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	//멤버필드
	Vector<GradeBean> gradeList;
	
	public GradeServiceImpl() {
		
		Vector<GradeBean> gradeList = new Vector<GradeBean>(); //초기화
	}
	//멤버 메소드 에어리어
	@Override
	public void input(GradeBean grade) {
		// 성적표 출력
		//int a=0;//지역변수를 초기화
		gradeList.add(grade);
		}

	@Override
	public Vector<GradeBean> getList() {
		//Vector<GradeBean> tempList = new Vector<GradeBean>();
		//return tempList;
		return gradeList;
		// R성적표 리스트 출력
		
		
	}

	@Override
	public void getGradeByHak() {
		//성적표 조회(학번)
		
	}

	@Override
	public void update() {
		// U 성적표 수정
	}

	@Override
	public void delete() {
		// D 성적표 삭제
		
	}

	@Override
	public void getCount() {
		// R 카운트 조회
		
	}

	@Override
	public void getCountByName() {
		// R 이름조회시 카운트 조회
		
	}

	@Override
	public void getGradeByName() {
		// R 성적표 조회(이름)
		
	}

	@Override
	public void getGradeByname() {
		// TODO Auto-generated method stub
		
	}

}
