package f_oop2;

public abstract class SampleAbstractParent {

	// 추상 메서드 : 선언부만 있고 구현부는 없는 메서드
	abstract void abstractMethod();
	void method() {	// 일반 메서드
		
	}
}


class SampleAbsractChild extends SampleAbstractParent{

	@Override
	void abstractMethod() {

		
	}
	
}