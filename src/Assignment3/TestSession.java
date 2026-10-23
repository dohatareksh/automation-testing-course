package Assignment3;
// Create a TestSession class to explore static vs instance: a static sessionCount field incremented in the
//constructor; instance fields sessionId (auto-assigned from count), browser (enum), and startTime
//(System.currentTimeMillis()). Static getSessionCount() method. Instance getInfo() method. Create 3 objects
//and verify shared count.
public class TestSession {

    private static int sessionCount = 0;

    private int sessionId;
    private Browser browser;
    private long startTime;

    enum Browser {
        Chrome,
        Firefox,
        Edge
    }

    public TestSession(Browser browser) {
        sessionCount++;
        this.sessionId = sessionCount;
        this.browser = browser;
        this.startTime = System.currentTimeMillis();
    }

    public static int getSessionCount() {
        return sessionCount;
    }

    public String getInfo() {
        return "Session ID: " + sessionId
                + ", Browser: " + browser
                + ", Start Time: " + startTime;
    }

    public static void main(String[] args) {

        TestSession session1 = new TestSession(Browser.Chrome);
        TestSession session2 = new TestSession(Browser.Firefox);
        TestSession session3 = new TestSession(Browser.Edge);

        System.out.println(session1.getInfo());
        System.out.println(session2.getInfo());
        System.out.println(session3.getInfo());

        System.out.println("Total Sessions: " + TestSession.getSessionCount());
    }
}