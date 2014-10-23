package com.mycompany;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;

public class PhaseTracker implements javax.faces.event.PhaseListener {
	private static final long serialVersionUID = 1L;

	public void afterPhase(PhaseEvent e) {
		e.getFacesContext().getExternalContext().log("after " + e.getPhaseId());
		//System.out.println("after " + e.getPhaseId());
	}

	public void beforePhase(PhaseEvent e) {
		e.getFacesContext().getExternalContext().log("before " + e.getPhaseId());
		//System.out.println("before " + e.getPhaseId());
	}

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}
}
