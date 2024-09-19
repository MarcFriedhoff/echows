package echows;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class admin

{
	// ---( internal utility methods )---

	final static admin _instance = new admin();

	static admin _newInstance() { return new admin(); }

	static admin _cast(Object o) { return (admin)o; }

	// ---( server methods )---




	public static final void getAcls (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getAcls)>> ---
		// @sigtype java 3.5
		// [o] field:0:required out
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("current dir: " + System.getProperty("user.dir"));
		
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "out", buffer.toString() );
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

