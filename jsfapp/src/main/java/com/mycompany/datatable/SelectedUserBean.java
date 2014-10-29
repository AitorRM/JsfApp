package com.mycompany.datatable;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;

import org.ajax4jsf.model.DataComponentState;
import org.ajax4jsf.model.ExtendedDataModel;
import org.ajax4jsf.model.SequenceRange;
import org.richfaces.component.DataAdaptorIterationState;
import org.richfaces.component.UIDataTable;

@ManagedBean
@ViewScoped
public class SelectedUserBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private User selectedUser;

	public User getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
	}

	public void selectUser(AjaxBehaviorEvent event) {
		UIDataTable uiDataTable = (UIDataTable) event.getSource();
		DataComponentState componentState = uiDataTable.getComponentState();
		SequenceRange range = (SequenceRange) componentState.getRange();
		int rowPrevius = range.getFirstRow();
		DataAdaptorIterationState dataAdaptor = (DataAdaptorIterationState) uiDataTable.getIterationState();
		ExtendedDataModel<?> dataModel = (ExtendedDataModel<?>) dataAdaptor.getDataModel();
		dataModel.setRowIndex((rowPrevius) + (int) dataModel.getRowKey());
		selectedUser = (User)dataModel.getRowData();
	}
}
