import java.applet.Applet;
import java.awt.*;
public class MyApplet2 extends Applet {
	Label label1 = new Label("��ʾ�����ش���");
	TextArea text1 = new TextArea(1,42);
	Button ShowBtn = new Button("��ʾ");
	Button HideBtn = new Button("����");
	Frame frame1 = new Frame();
	Label label2 = new Label("		");
	
	public void init(){
		text1.setEditable(true);
		add(label1);
		add(text1);
		add(ShowBtn);
		add(HideBtn);
		frame1.add(label2);
		show();
	}
	
	@Override
	public boolean action(Event evt, Object what) {
		if("��ʾ".equals(what)){
			String text = text1.getText();
			label2.setText(text);
			frame1.setVisible(true);
			frame1.setTitle("���");
			frame1.setSize(300, 300);
			
		}else if("����".equals(what)){
			frame1.setVisible(false);
		}
		

		return true;
	}
}
