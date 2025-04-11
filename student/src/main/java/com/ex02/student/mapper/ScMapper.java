package com.ex02.student.mapper;

import com.ex02.student.po.Sc;

public interface ScMapper {
    Sc selectScBySno(String sno);
    Sc selectScBySno1(String sno);
    int insertSc(Sc sc);
    int deleteSc(String sno);
    int updateSc(Sc sc);

}
