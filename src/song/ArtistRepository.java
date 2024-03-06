package song;

import util.Utility;

import java.io.*;
import java.util.*;

public class ArtistRepository {

    // key : 가수이름 , value : Artist 객체
    private static Map<String, Artist> artistList;



    static {
        artistList = new HashMap<>();
    }

    // 신규 가수를 map에 추가
    public void addNewArtist(String artistName, String songName){

        // 1. 신규 가수 정보 생성 -> Set 객체 전달
        Artist artist = new Artist(artistName, new HashSet<>());
        
        // 2 . 생성된 노래 목록을 리턴 받아서 노래 이름을 추가
        artist.getSongList().add(songName);
        
        // 3. 완성된 객체를 Map에 저장
        artistList.put(artistName, artist);

    }


    // 가수명을 전달받아 현재 등록된 가수인지의 리턴하는 기능
    boolean isRegisted(String artistName){

        return artistList.containsKey(artistName);
    }

    /**
     * 기존 가수 정보에 노래만 추가하는 기능
     * @param artistName - 사용자의 입력 가수 이름
     * @param songName -  사용자의 입력 노래 이름
     * @return - 곡명이 중복되었다면 false,
     *            곡이 정상적으로 추가 되었다면 true
    **/
    public boolean addNewSong(String artistName, String songName){
        //map에서 기존 가수 객체부터 찾기
        Artist artist = artistList.get(artistName);
        // set의 add는 add의 실행 결과를 boolean으로 리턴 ->
        // 중복이 발생 했다면 객체가 추가되지 않고 false를 리턴
        boolean flag = artist.getSongList().add(songName);

        return flag;

    }

    public static Map<String, Artist> getArtistList() {
        return artistList;
    }

    // 노래 목록을 찾아서 출력하는 기능
    public void showSongList(String artistName) {

        Artist artist = artistList.get(artistName);

        Set<String> songList = artist.getSongList();
        
        // set을 list로 변경하기
        ArrayList<String> songs = new ArrayList<>(songList);

        for (int i = 0; i < songs.size(); i++) {

            System.out.printf("* %d. %s\n", i + 1, songs.get(i));

        }
        
    }

    // 세이브 기능 FileOutputStream ObjectOutputStream
    public void saveData() {
        // 폴더 경로는 Utility클래스에 상수로 선언 되어 있음
        // 폴더가 실존 하지 않는 경우 생성을 하고 세이브 파일을 생성
        // 파일 명은 song.sav로 진행

        File file = new File(Utility.FILE_PATH);

        if(!file.exists()){

            file.mkdirs();
            System.out.println("폴더 생성 완료!");

            try (FileOutputStream fos = new FileOutputStream(Utility.FILE_PATH + "/song.sav")){
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(artistList);

                System.out.println("세이브 파일 생성 완료!");
            }catch (Exception e){
                e.printStackTrace();
            }

        }else {
            System.out.println("이미 존재하는 경로 입니다.");
        }




    }

    // 로드 기능 FileInputStream ObjectInputStream
    public void loadData() {

        // 존재 한다면 로드르 진행해서 artistList에 할당 (대입)해야함

        File file = new File(Utility.FILE_PATH + "/song.sav");

        // 세이브 파일이 존재 하는지 부터 체크
        if(file.exists()){
            try (FileInputStream fis = new FileInputStream(Utility.FILE_PATH + "/song.sav")){
                ObjectInputStream ois = new ObjectInputStream(fis);
                // 형 변환
                artistList = (Map<String, Artist>) ois.readObject();

                System.out.println("저장이 정상적으로 되었습니다.");
            }catch (Exception e){
                e.printStackTrace();
            }
        }else {
            System.out.println("\n기존 세이브파일이 존재하지 않습니다\n 음원을 먼저 담아주세요.");
        }



    }
}
