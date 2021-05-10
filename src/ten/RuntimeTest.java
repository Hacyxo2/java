package ten;

import java.io.IOException;

public class RuntimeTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime rt = Runtime.getRuntime();
		Process pc = null;
		try {
			//외부 프로세스 실행
			pc = rt.exec("C:\\Windows\\system32\\cmd.exe");
			System.out.println("PSheet Excute!!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//명령어 종료시 까지 대기
			pc.waitFor(); 
			//명령어 종료시 하위 프로세스 제거
			pc.destroy();
		}
	}
}
