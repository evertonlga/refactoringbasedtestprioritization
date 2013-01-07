package core.tests;
/*  Copyright (c) 2000-2004 jMock.org
 */


import org.jmock.core.CoreMock;
import org.jmock.core.DynamicMock;
import org.jmock.core.InvocationDispatcher;

import test.jmock.core.DummyInterface;


public class CoreMockTest extends AbstractDynamicMockTest
{
    protected DynamicMock createDynamicMock( String name, InvocationDispatcher dispatcher ) {
        return new CoreMock( DummyInterface.class, name, dispatcher );
    }

    protected Class mockedType() {
        return DummyInterface.class;
    }
}
