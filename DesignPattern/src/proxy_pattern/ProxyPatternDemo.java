package proxy_pattern;

public class ProxyPatternDemo { // һ���������һ����Ĺ��ܡ�

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");
		// ͼ�񽫴Ӵ��̼���
		image.display(); 
		System.out.println("");
		// ͼ����Ҫ�Ӵ��̼���
	}

}
