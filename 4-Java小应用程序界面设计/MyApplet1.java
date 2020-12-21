import java.applet.Applet;
import java.awt.*;
public class MyApplet1 extends Applet {
	Label label1 = new Label("		");
	TextArea text1 = new TextArea(1,42);
	Button ShowBtn = new Button("判断");
	Frame frame1 = new Frame();
	
	public void init(){
		text1.setEditable(true);
		add(label1);
		add(text1);
		add(ShowBtn);
		show();
	}
	
	@Override
	public boolean action(Event evt, Object what) {
		String text = text1.getText();
		text1.setText(text);
		int a = Integer.parseInt(text);
		if(a %2 == 0){
			label1.setText(a + "是偶数");
		}else{
			label1.setText(a + "不是偶数");
		}
		return true;
	}
}
