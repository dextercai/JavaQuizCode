import java.applet.Applet;
import java.awt.*;
public class MyApplet2 extends Applet {
	Label label1 = new Label("显示和隐藏窗体");
	TextArea text1 = new TextArea(1,42);
	Button ShowBtn = new Button("显示");
	Button HideBtn = new Button("隐藏");
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
		if("显示".equals(what)){
			String text = text1.getText();
			label2.setText(text);
			frame1.setVisible(true);
			frame1.setTitle("结果");
			frame1.setSize(300, 300);
			
		}else if("隐藏".equals(what)){
			frame1.setVisible(false);
		}
		

		return true;
	}
}
