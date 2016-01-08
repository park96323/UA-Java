 /* Copyright (c) 1996-2015, OPC Foundation. All rights reserved.
   The source code in this file is covered under a dual-license scenario:
     - RCL: for OPC Foundation members in good-standing
     - GPL V2: everybody else
   RCL license terms accompanied with this source code. See http://opcfoundation.org/License/RCL/1.00/
   GNU General Public License as published by the Free Software Foundation;
   version 2 of the License are accompanied with this source code. See http://opcfoundation.org/License/GPLv2
   This source code is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/

package org.opcfoundation.ua.core;

import org.opcfoundation.ua.builtintypes.ServiceResponse;
import org.opcfoundation.ua.builtintypes.ExpandedNodeId;
import org.opcfoundation.ua.core.Identifiers;
import org.opcfoundation.ua.utils.ObjectUtils;
import java.util.Arrays;
import org.opcfoundation.ua.builtintypes.DiagnosticInfo;
import org.opcfoundation.ua.builtintypes.StatusCode;
import org.opcfoundation.ua.core.ResponseHeader;


public class SetTriggeringResponse extends Object implements ServiceResponse {

	public static final ExpandedNodeId ID = new ExpandedNodeId(Identifiers.SetTriggeringResponse);
	public static final ExpandedNodeId BINARY = new ExpandedNodeId(Identifiers.SetTriggeringResponse_Encoding_DefaultBinary);
	public static final ExpandedNodeId XML = new ExpandedNodeId(Identifiers.SetTriggeringResponse_Encoding_DefaultXml);
	
    protected ResponseHeader ResponseHeader;
    protected StatusCode[] AddResults;
    protected DiagnosticInfo[] AddDiagnosticInfos;
    protected StatusCode[] RemoveResults;
    protected DiagnosticInfo[] RemoveDiagnosticInfos;
    
    public SetTriggeringResponse() {}
    
    public SetTriggeringResponse(ResponseHeader ResponseHeader, StatusCode[] AddResults, DiagnosticInfo[] AddDiagnosticInfos, StatusCode[] RemoveResults, DiagnosticInfo[] RemoveDiagnosticInfos)
    {
        this.ResponseHeader = ResponseHeader;
        this.AddResults = AddResults;
        this.AddDiagnosticInfos = AddDiagnosticInfos;
        this.RemoveResults = RemoveResults;
        this.RemoveDiagnosticInfos = RemoveDiagnosticInfos;
    }
    
    public ResponseHeader getResponseHeader()
    {
        return ResponseHeader;
    }
    
    public void setResponseHeader(ResponseHeader ResponseHeader)
    {
        this.ResponseHeader = ResponseHeader;
    }
    
    public StatusCode[] getAddResults()
    {
        return AddResults;
    }
    
    public void setAddResults(StatusCode[] AddResults)
    {
        this.AddResults = AddResults;
    }
    
    public DiagnosticInfo[] getAddDiagnosticInfos()
    {
        return AddDiagnosticInfos;
    }
    
    public void setAddDiagnosticInfos(DiagnosticInfo[] AddDiagnosticInfos)
    {
        this.AddDiagnosticInfos = AddDiagnosticInfos;
    }
    
    public StatusCode[] getRemoveResults()
    {
        return RemoveResults;
    }
    
    public void setRemoveResults(StatusCode[] RemoveResults)
    {
        this.RemoveResults = RemoveResults;
    }
    
    public DiagnosticInfo[] getRemoveDiagnosticInfos()
    {
        return RemoveDiagnosticInfos;
    }
    
    public void setRemoveDiagnosticInfos(DiagnosticInfo[] RemoveDiagnosticInfos)
    {
        this.RemoveDiagnosticInfos = RemoveDiagnosticInfos;
    }
    
    /**
      * Deep clone
      *
      * @return cloned SetTriggeringResponse
      */
    public SetTriggeringResponse clone()
    {
        SetTriggeringResponse result = new SetTriggeringResponse();
        result.ResponseHeader = ResponseHeader==null ? null : ResponseHeader.clone();
        result.AddResults = AddResults==null ? null : AddResults.clone();
        result.AddDiagnosticInfos = AddDiagnosticInfos==null ? null : AddDiagnosticInfos.clone();
        result.RemoveResults = RemoveResults==null ? null : RemoveResults.clone();
        result.RemoveDiagnosticInfos = RemoveDiagnosticInfos==null ? null : RemoveDiagnosticInfos.clone();
        return result;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        SetTriggeringResponse other = (SetTriggeringResponse) obj;
        if (ResponseHeader==null) {
            if (other.ResponseHeader != null) return false;
        } else if (!ResponseHeader.equals(other.ResponseHeader)) return false;
        if (AddResults==null) {
            if (other.AddResults != null) return false;
        } else if (!Arrays.equals(AddResults, other.AddResults)) return false;
        if (AddDiagnosticInfos==null) {
            if (other.AddDiagnosticInfos != null) return false;
        } else if (!Arrays.equals(AddDiagnosticInfos, other.AddDiagnosticInfos)) return false;
        if (RemoveResults==null) {
            if (other.RemoveResults != null) return false;
        } else if (!Arrays.equals(RemoveResults, other.RemoveResults)) return false;
        if (RemoveDiagnosticInfos==null) {
            if (other.RemoveDiagnosticInfos != null) return false;
        } else if (!Arrays.equals(RemoveDiagnosticInfos, other.RemoveDiagnosticInfos)) return false;
        return true;
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((ResponseHeader == null) ? 0 : ResponseHeader.hashCode());
        result = prime * result
                + ((AddResults == null) ? 0 : Arrays.hashCode(AddResults));
        result = prime * result
                + ((AddDiagnosticInfos == null) ? 0 : Arrays.hashCode(AddDiagnosticInfos));
        result = prime * result
                + ((RemoveResults == null) ? 0 : Arrays.hashCode(RemoveResults));
        result = prime * result
                + ((RemoveDiagnosticInfos == null) ? 0 : Arrays.hashCode(RemoveDiagnosticInfos));
        return result;
    }
    


	public ExpandedNodeId getTypeId() {
		return ID;
	}

	public ExpandedNodeId getXmlEncodeId() {
		return XML;
	}

	public ExpandedNodeId getBinaryEncodeId() {
		return BINARY;
	}

	public String toString() {
		return ObjectUtils.printFieldsDeep(this);
	}
	
}