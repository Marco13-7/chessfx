module hellofX {
	
	requires transitive javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.fxml;
	exports application;
	
	requires ChessModelModule;
}
