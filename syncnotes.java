public class Solution 
{

    public static void main(String[] args)
    {
        Note n=  new Note();
        n.addNote(0," ");
        n.removeNote(0);

    }

    public static class Note 
    {

        public final List<String> notes = new ArrayList<String>();

        public synchronized void addNote(int index, String note) 
        {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);

            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public synchronized void removeNote(int index) 
        {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }
}
