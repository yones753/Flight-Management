package dao;

import poco.Ipoco;
import java.util.List;

public interface Idao<T extends Ipoco> {
    T Get(int id);

    List GetAll();

    boolean Add(T t);

    boolean Remove(int id);

    boolean Update(T t,int id);
}
