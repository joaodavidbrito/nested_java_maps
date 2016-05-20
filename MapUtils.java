
public class MapUtils {

  public static void addDtoToMap(Map<Long, Map<String, Map<Short, List<SomeDto>>>> map, SomeDto dto) {
  	
  	// get the first inner map
  	Map<String, Map<Short, List<SomeDto>>> someMap = map.get(dto.gePrimaryKey());
  	
  	if(someMap == null){
  		someMap = new HashMap<>();
  		map.put(dto.gePrimaryKey(), someMap);
  	}
  	
  	
  	// get the second inner map
  	Map<Short, List<SomeDto>> otherMap = someMap.get(dto.getSomeId());
  	
  	if(otherMap == null){
  		otherMap = new HashMap<>();
  		someMap.put(dto.getSomeId(), otherMap);
  	}
  	
  	
  	// get the inner list
  	List<SomeDto> someList = otherMap.get(dto.getOtherId());
  	
  	if(someList == null){
  		someList = new ArrayList<>();
  		otherMap.put(dto.getOtherId()), someList);
  	}
  	
  	// add dto to the list
  	someList.add(dto);
  }
}
