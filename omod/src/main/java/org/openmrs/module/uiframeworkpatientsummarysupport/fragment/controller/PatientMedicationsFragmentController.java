/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.uiframeworkpatientsummarysupport.fragment.controller;

import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.ui.framework.annotation.FragmentParam;
import org.openmrs.ui.framework.fragment.FragmentModel;
import org.springframework.stereotype.Controller;

/**
 * {@link Controller} for the Patient Medications Fragment
 */
public class PatientMedicationsFragmentController {
	
	public void controller(FragmentModel model, @FragmentParam(value = "patientId") Patient patient) {
		model.addAttribute("medications", Context.getOrderService().getDrugOrdersByPatient(patient));
	}
}
