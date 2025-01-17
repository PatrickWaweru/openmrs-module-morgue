/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.1 (the "License"); you may not use this file except in
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
package org.openmrs.module.morgue.rest.controller.base;

import org.openmrs.module.webservices.rest.web.RestConstants;
import org.openmrs.module.webservices.rest.web.v1_0.controller.MainResourceController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * REST controller for morgue resources.
 */
@Controller
@RequestMapping("/rest/" + RestConstants.VERSION_1 + MorgueResourceController.MORGUE_NAMESPACE)
public class MorgueResourceController extends MainResourceController {
	
	public static final String MORGUE_NAMESPACE = "/morgue";
	
	@Override
	public String getNamespace() {
		return RestConstants.VERSION_1 + MorgueResourceController.MORGUE_NAMESPACE;
	}
}
