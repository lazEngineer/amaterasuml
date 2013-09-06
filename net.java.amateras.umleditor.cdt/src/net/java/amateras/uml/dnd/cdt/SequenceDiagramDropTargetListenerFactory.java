package net.java.amateras.uml.dnd.cdt;

import net.java.amateras.uml.dnd.UMLDropTargetListenerFactory;
import net.java.amateras.uml.dnd.cdt.SequenceDiagramDropTargetListener;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.jface.util.TransferDropTargetListener;
import org.eclipse.ui.views.navigator.LocalSelectionTransfer;

@SuppressWarnings("deprecation")
public class SequenceDiagramDropTargetListenerFactory extends
		UMLDropTargetListenerFactory {

	/* (non-Javadoc)
	 * @see net.java.amateras.uml.dnd.UMLDropTargetListenerFactory#getDropTargetListener(org.eclipse.gef.EditPartViewer)
	 */
	public TransferDropTargetListener getDropTargetListener(
			EditPartViewer viewer) {
		return new SequenceDiagramDropTargetListener(viewer, LocalSelectionTransfer.getInstance());
	}

	/* (non-Javadoc)
	 * @see net.java.amateras.uml.dnd.UMLDropTargetListenerFactory#accept(java.lang.String)
	 */
	public boolean accept(String key) {
		if ("sequence".equals(key)) {
			return true;
		}
		return false;
	}
}
