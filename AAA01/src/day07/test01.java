package day07;
import java.io.*;
public class test01 {

	public static void main(String[] args) {
		/**
		 * Created by Nickwong on 31/07/2018.
		 * ����1-8¥�Ľ��飬�Ż��˴���
		 */

		//readFile();
		writeFile();
	}

	/**
	 * ����TXT�ļ�
	 */
	public static void readFile() {
		String pathname = "input.txt"; // ����·�������·�������ԣ�д���ļ�ʱ��ʾ���·��,��ȡ����·����input.txt�ļ�
		//��ֹ�ļ��������ȡʧ�ܣ���catch��׽���󲢴�ӡ��Ҳ����throw;
		//���ر��ļ��ᵼ����Դ��й¶����д�ļ���ͬ��
		//Java7��try-with-resources�������Źر��ļ����쳣ʱ�Զ��ر��ļ�����ϸ���https://stackoverflow.com/a/12665271
		try (FileReader reader = new FileReader(pathname);
				BufferedReader br = new BufferedReader(reader) // ����һ�����������ļ�����ת�ɼ�����ܶ���������
				) {
			String line;
			//�����Ƽ����Ӽ���д��
			while ((line = br.readLine()) != null) {
				// һ�ζ���һ������
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * д��TXT�ļ�
	 */
	public static void writeFile() {
		try {
			File writeName = new File("output.txt"); // ���·�������û����Ҫ����һ���µ�output.txt�ļ�
			writeName.createNewFile(); // �������ļ�,��ͬ�����ļ��Ļ�ֱ�Ӹ���
			try (FileWriter writer = new FileWriter(writeName);
					BufferedWriter out = new BufferedWriter(writer)
					) {
				out.write("�һ�д���ļ���1\r\n"); // \r\n��Ϊ����
				out.write("�һ�д���ļ���2\r\n"); // \r\n��Ϊ����
				out.flush(); // �ѻ���������ѹ���ļ�
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



}


