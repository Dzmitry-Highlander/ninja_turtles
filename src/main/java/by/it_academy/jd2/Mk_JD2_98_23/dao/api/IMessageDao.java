package by.it_academy.jd2.Mk_JD2_98_23.dao.api;

import by.it_academy.jd2.Mk_JD2_98_23.core.dto.MessageDTO;

public interface IMessageDao extends ICRUDDao <MessageDTO>{
    void delete(int id);
}
