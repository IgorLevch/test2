package DZ3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directory {

    private Map<String, List<String>> hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add (String surname, String phone_number) {
        if (hm.containsKey(surname)) {
            phone_number_list = hm.get(surname);
            phone_number_list.add(phone_number);
            hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return hm.get(surname);
    }

    }


