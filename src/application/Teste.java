package application;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import com.sun.glass.ui.Application;
import com.sun.glass.ui.CommonDialogs.ExtensionFilter;
import com.sun.glass.ui.CommonDialogs.FileChooserResult;
import com.sun.glass.ui.Cursor;
import com.sun.glass.ui.GlassRobot;
import com.sun.glass.ui.Pixels;
import com.sun.glass.ui.Screen;
import com.sun.glass.ui.Size;
import com.sun.glass.ui.Timer;
import com.sun.glass.ui.View;
import com.sun.glass.ui.Window;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;

public class Teste extends Application {

public Teste() {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("application.Teste.fxml"));

	}

	@FXML
	private MenuItem itemHum;

	@FXML
	private MenuItem itemDois;

	@FXML
	public static void itemHum() {

		Alert itemHum = new Alert(Alert.AlertType.INFORMATION);
		itemHum.setTitle("HUM");
		itemHum.show();

	}

	@FXML
	public static void itemDois() {

		Alert itemDois = new Alert(Alert.AlertType.INFORMATION);
		itemDois.setTitle("DOIS");
		itemDois.show();

	}

	@Override
	protected Object _enterNestedEventLoop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected int _getKeyCodeForChar(char arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void _invokeAndWait(Runnable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void _invokeLater(Runnable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void _leaveNestedEventLoop(Object arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean _supportsTransparentWindows() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean _supportsUnifiedWindows() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cursor createCursor(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cursor createCursor(int arg0, int arg1, Pixels arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pixels createPixels(int arg0, int arg1, ByteBuffer arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pixels createPixels(int arg0, int arg1, IntBuffer arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pixels createPixels(int arg0, int arg1, IntBuffer arg2, float arg3, float arg4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GlassRobot createRobot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Timer createTimer(Runnable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public View createView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Window createWindow(long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Window createWindow(Window arg0, Screen arg1, int arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void runLoop(Runnable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected FileChooserResult staticCommonDialogs_showFileChooser(Window arg0, String arg1, String arg2, String arg3,
			int arg4, boolean arg5, ExtensionFilter[] arg6, int arg7) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected File staticCommonDialogs_showFolderChooser(Window arg0, String arg1, String arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Size staticCursor_getBestSize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void staticCursor_setVisible(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected int staticPixels_getNativeFormat() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected Screen[] staticScreen_getScreens() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected double staticScreen_getVideoRefreshPeriod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int staticTimer_getMaxPeriod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int staticTimer_getMinPeriod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int staticView_getMultiClickMaxX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int staticView_getMultiClickMaxY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected long staticView_getMultiClickTime() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
