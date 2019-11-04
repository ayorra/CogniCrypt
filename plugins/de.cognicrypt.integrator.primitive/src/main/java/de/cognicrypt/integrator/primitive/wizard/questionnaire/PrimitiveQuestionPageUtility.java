/********************************************************************************
 * Copyright (c) 2015-2019 TU Darmstadt, Paderborn University
 * 

 * http://www.eclipse.org/legal/epl-2.0. SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package de.cognicrypt.integrator.primitive.wizard.questionnaire;

import java.util.List;
import de.cognicrypt.codegenerator.question.Answer;

public class PrimitiveQuestionPageUtility {

	/*
	 * This method returns the index of the answer that has value in it return @index
	 */
	public int getIndex(final List<Answer> answers, final String value) {
		int index = -1;
		for (int i = 0; i < answers.size(); i++) {
			if (answers.get(i).getValue().equals(value)) {
				index = i;
			}

		}
		return index;

	}

}
