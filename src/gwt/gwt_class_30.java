package gwt;

import com.extjs.gxt.ui.client.widget.TabPanel;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;

public class gwt_class_30 {
	public class MyTabHeader extends Composite {
		  @UiField Image icon;

		  public MyTabHeader(String iconPath) {
//		    Object uiBinder;
//			initWidget(uiBinder.createAndBindUi(this));
		    this.icon.setUrl(iconPath);
		  }
		}

		public class MyTabPanel extends TabPanel {
		  public MyTabPanel() {
//		    String icon1 = MyResources.INSTANCE.icon1().getURL();
		    MyTabHeader tabHeader1 = new MyWidget(icon1);
		    Widget tabContent1 = new HTML("Content 1");
		    add(tabContent1, tabHeader1);

		    String icon2 = MyResources.INSTANCE.icon2().getURL();
		    MyTabHeader tabHeader2 = new MyWidget(icon2);
		    Widget tabContent2 = new HTML("Content 2");
		    add(tabContent2, tabHeader2);
		  }
		}
}
