package ten;

import java.io.IOException;

public class RuntimeTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime rt = Runtime.getRuntime();
		Process pc = null;
		try {
			//�ܺ� ���μ��� ����
			pc = rt.exec("C:\\Windows\\system32\\cmd.exe");
			System.out.println("PSheet Excute!!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//��ɾ� ����� ���� ���
			pc.waitFor(); 
			//��ɾ� ����� ���� ���μ��� ����
			pc.destroy();
		}
	}
}
