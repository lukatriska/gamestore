import org.junit.Test;

import static org.junit.Assert.*;

public class PlatformTest
{
    @Test
    public void toStringTest() throws Exception
    {
        assertEquals("windows", Platform.WINDOWS.toString());
        assertEquals("ubuntu", Platform.UBUNTU.toString());
        assertEquals("macos", Platform.MACOS.toString());
        assertEquals("ios", Platform.IOS.toString());
        assertEquals("android", Platform.ANDROID.toString());
    }

}