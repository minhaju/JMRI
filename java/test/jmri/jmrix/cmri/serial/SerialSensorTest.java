package jmri.jmrix.cmri.serial;

import jmri.util.JUnitUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Paul Bender Copyright (C) 2017	
 */
public class SerialSensorTest {

    private jmri.jmrix.cmri.CMRISystemConnectionMemo memo = null;
    private SerialTrafficControlScaffold tcis = null;

    @Test
    public void testCTor() {
        SerialSensor t = new SerialSensor("CS4");
        Assert.assertNotNull("exists",t);
    }

    @Test
    public void test2ParamCTor() {
        SerialSensor t = new SerialSensor("CS4","Test");
        Assert.assertNotNull("exists",t);
    }

    // The minimal setup for log4J
    @Before
    public void setUp() {
        JUnitUtil.setUp();
        // prepare an interface
        tcis = new SerialTrafficControlScaffold();
        memo = new jmri.jmrix.cmri.CMRISystemConnectionMemo();
        memo.setTrafficController(tcis);
        new SerialNode(0, SerialNode.SMINI,tcis);
    }

    @After
    public void tearDown() {
        JUnitUtil.tearDown();
    }

}
