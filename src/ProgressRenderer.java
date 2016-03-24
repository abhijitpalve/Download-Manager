import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

// This class renders a JProgressBar in a table cell.
/**
 * @author asusrockz
 *
 */
class ProgressRenderer extends JProgressBar implements TableCellRenderer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Constructor for ProgressRenderer.
	/**
	 * @param min
	 * @param max
	 */
	public ProgressRenderer(int min, int max) {
		super(min, max);
	}

	/*
	 * Returns this JProgressBar as the renderer for the given table cell.
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.swing.table.TableCellRenderer#getTableCellRendererComponent(javax
	 * .swing.JTable, java.lang.Object, boolean, boolean, int, int)
	 */
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		// Set JProgressBar's percent complete value.
		setValue((int) ((Float) value).floatValue());
		return this;
	}

}
