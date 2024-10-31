import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        
        Map<String, Integer> genresMap = new HashMap<>();
        Map<String, List<Song>> songs = new HashMap<>();
        
        for(int i=0;i<genres.length;i++) {
            genresMap.put(genres[i], genresMap.getOrDefault(genres[i], 0) + plays[i]);
            
            songs.putIfAbsent(genres[i], new ArrayList<>());
            songs.get(genres[i]).add(new Song(i, plays[i]));
        }
        
        List<Map.Entry<String, Integer>> sortedGenres = genresMap.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .collect(Collectors.toList());
        
        for(Map.Entry<String, Integer> genre: sortedGenres) {
            List<Song> song = songs.get(genre.getKey());
            
            song.sort((a, b) -> {
                if(a.plays != b.plays) {
                    return b.plays - a.plays;
                }
                
                return a.index - b.index;
            });
                
            for(int i=0;i<Math.min(2, song.size());i++) {
                answer.add(song.get(i).index);
            }
        }
            
        return answer.stream().mapToInt(i->i).toArray();
    }
    
    static class Song {
        int index;
        int plays;
        
        public Song(int index, int plays) {
            this.index = index;
            this.plays = plays;
        }
    }
}