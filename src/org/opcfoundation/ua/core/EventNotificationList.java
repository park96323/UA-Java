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

import org.opcfoundation.ua.builtintypes.Structure;
import org.opcfoundation.ua.builtintypes.ExpandedNodeId;
import org.opcfoundation.ua.core.Identifiers;
import org.opcfoundation.ua.utils.ObjectUtils;
import java.util.Arrays;
import org.opcfoundation.ua.core.EventFieldList;
import org.opcfoundation.ua.core.NotificationData;



public class EventNotificationList extends NotificationData implements Structure, Cloneable {
	
	public static final ExpandedNodeId ID = new ExpandedNodeId(Identifiers.EventNotificationList);
	public static final ExpandedNodeId BINARY = new ExpandedNodeId(Identifiers.EventNotificationList_Encoding_DefaultBinary);
	public static final ExpandedNodeId XML = new ExpandedNodeId(Identifiers.EventNotificationList_Encoding_DefaultXml);
	
    protected EventFieldList[] Events;
    
    public EventNotificationList() {}
    
    public EventNotificationList(EventFieldList[] Events)
    {
        this.Events = Events;
    }
    
    public EventFieldList[] getEvents()
    {
        return Events;
    }
    
    public void setEvents(EventFieldList[] Events)
    {
        this.Events = Events;
    }
    
    /**
      * Deep clone
      *
      * @return cloned EventNotificationList
      */
    public EventNotificationList clone()
    {
        EventNotificationList result = new EventNotificationList();
        if (Events!=null) {
            result.Events = new EventFieldList[Events.length];
            for (int i=0; i<Events.length; i++)
                result.Events[i] = Events[i].clone();
        }
        return result;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        EventNotificationList other = (EventNotificationList) obj;
        if (Events==null) {
            if (other.Events != null) return false;
        } else if (!Arrays.equals(Events, other.Events)) return false;
        return true;
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((Events == null) ? 0 : Arrays.hashCode(Events));
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
		return "EventNotificationList: "+ObjectUtils.printFieldsDeep(this);
	}

}