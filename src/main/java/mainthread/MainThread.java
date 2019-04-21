package mainthread;

import entity.Video;
import entity.VideoInformation;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class MainThread {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/main/resources/tom&jery.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        int count = 0;
        ArrayList<Video> list = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            if (count == 0) {
                count++;
                continue;
            }
            System.out.println(line);
            String[] splitted = line.split("\\s{2,}");
            if (splitted.length == 4) {
                String date = splitted[0];
                String id = splitted[1];
                String title = splitted[2];
                double views = Double.parseDouble(splitted[3]);
                Video video = new Video(date, id, title, views);
                list.add(video);
            }
            count++;
        }
        HashMap<String, VideoInformation> statistic = new HashMap<>();
        for (Video information : list) {
            double currentMoney = 0;
            if (statistic.containsKey(information.getId())) {
                VideoInformation videoInformation = statistic.get(information.getId());
                currentMoney = videoInformation.getViews();
            }
            currentMoney = currentMoney + information.getViews();
            VideoInformation videoPunishment = new VideoInformation(information.getId(), information.getTitle(), currentMoney);
            statistic.put(information.getId(), videoPunishment);
        }

        for (String rollNumber :
                statistic.keySet()) {
            System.out.println(rollNumber);
            VideoInformation videoInformation = statistic.get(rollNumber);
            System.out.println(videoInformation.getViews());
        }

    }
}

