package immutable;

import java.util.Arrays;

public class Ex04Music {
    /**
     * Bài tập 1:
     * Viết chương trình in ra danh sách tên bài nhạc mp3 có trong thư mục music
     * Input: String bh1 = d:/music/somthingyoulike.mp3
     * String bh2 = d:/music/foreoverandone.mp3
     * String bh3 = d:/music/takemetoyourheart.mov
     * String [] arrStr = {bh1, bh2, bh3}
     * Output:
     * Danh sach bai hat mp3 trong thu muc d:/music
     * 1. somthingyoulike
     * 2. foreoverandone
     */
    public static void main(String[] args) {
        String[] paths = {
                "d:/music/somthingyoulike.mp3",
                "d:/music/foreoverandone.mp3",
                "d:/music/takemetoyourheart.mov"
        };

        String[] mp3Songs = getMp3Songs(paths, ".mp3");
        for (String song : mp3Songs) {
            System.out.println(song);
        }
    }

    private static String[] getMp3Songs(String[] paths, String extension) {
        String[] songs = new String[paths.length];
        int count = 0;
        for (String path : paths) {
            if (path.endsWith(extension)) {
                String song = path.substring(path.lastIndexOf("/") + 1, path.lastIndexOf("."));
                songs[count++] = song;
            }
        }
        return Arrays.copyOfRange(songs, 0, count);
    }
}
