/**********************************************************************
 * This file is part of Adempiere ERP Bazaar                          *
 * http://www.adempiere.org                                           *
 *                                                                    *
 * Copyright (C) Trifon Trifonov.                                     *
 * Copyright (C) Contributors                                         *
 *                                                                    *
 * This program is free software;
 you can redistribute it and/or      *
 * modify it under the terms of the GNU General Public License        *
 * as published by the Free Software Foundation;
 either version 2     *
 * of the License, or (at your option) any later version.             *
 *                                                                    *
 * This program is distributed in the hope that it will be useful,    *
 * but WITHOUT ANY WARRANTY;
 without even the implied warranty of     *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the       *
 * GNU General Public License for more details.                       *
 *                                                                    *
 * You should have received a copy of the GNU General Public License  *
 * along with this program;
 if not, write to the Free Software        *
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,         *
 * MA 02110-1301, USA.                                                *
 *                                                                    *
 * Contributors:                                                      *
 * - Trifon Trifonov (trifonnt@users.sourceforge.net)                 *
 *                                                                    *
 * Sponsors:                                                          *
 * - Company (http://www.site.com)                                    *
 **********************************************************************/
package org.globalqss.model;

import java.math.BigDecimal;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for LCO_DIAN_ConceptFormat
 *  @author Trifon Trifonov (generated) 
 *  @version Release 3.4.2s
 */
public interface I_LCO_DIAN_ConceptFormat 
{

    /** TableName=LCO_DIAN_ConceptFormat */
    public static final String Table_Name = "LCO_DIAN_ConceptFormat";

    /** AD_Table_ID=1000016 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 2 - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /** Column name LCO_DIAN_ConceptFormat_ID */
    public static final String COLUMNNAME_LCO_DIAN_ConceptFormat_ID = "LCO_DIAN_ConceptFormat_ID";

	/** Set DIAN Concept Format	  */
	public void setLCO_DIAN_ConceptFormat_ID (int LCO_DIAN_ConceptFormat_ID);

	/** Get DIAN Concept Format	  */
	public int getLCO_DIAN_ConceptFormat_ID();

    /** Column name LCO_DIAN_Concept_ID */
    public static final String COLUMNNAME_LCO_DIAN_Concept_ID = "LCO_DIAN_Concept_ID";

	/** Set DIAN Concept	  */
	public void setLCO_DIAN_Concept_ID (int LCO_DIAN_Concept_ID);

	/** Get DIAN Concept	  */
	public int getLCO_DIAN_Concept_ID();

    /** Column name LCO_DIAN_Format_ID */
    public static final String COLUMNNAME_LCO_DIAN_Format_ID = "LCO_DIAN_Format_ID";

	/** Set DIAN Format	  */
	public void setLCO_DIAN_Format_ID (int LCO_DIAN_Format_ID);

	/** Get DIAN Format	  */
	public int getLCO_DIAN_Format_ID();
}