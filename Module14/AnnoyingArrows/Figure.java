/**
 Class for a simple character graphics figures to be sent to the screen.
 This class will draw an asterisk on the screen as a test.  It is not intended
 to be used as a “real” figure in any graphics.  It is intended to be used as a
 base class for other classes of figures that will be used in graphics applications
 */
    public class Figure
    {
        private int offset;


        public Figure()
        {
            offset = 0;
        }

        public Figure (int theOffset)
        {
            offset = theOffset;
        }

        public void setOffset(int newOffset)
        {
            offset = newOffset;
        }

        public int getOffset()
        {
            return offset;
        }

        /**
         Draws the figure at lineNumber lines down from the current line.
         */

        public void drawAt(int lineNumber)
        {
            int count;
            for (count = 0;count < lineNumber; count++)
                System.out.println();
            drawOffset();
        }

        /**
         Draws the figure at the current line.
         */
        public void drawOffset()
        {
            int count;
            for (count = 0; count < offset; count++)
                System.out.print(' ');
        }
    }

