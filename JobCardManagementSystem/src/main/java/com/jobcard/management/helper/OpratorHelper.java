package com.jobcard.management.helper;

import com.jobcard.management.dto.OperatorDto;
import com.jobcard.management.entity.OpratorEntity;

public class OpratorHelper {
		public static OpratorEntity operatorEntityConverter(OperatorDto operatorDto){
				return new OpratorEntity();
		}
}
