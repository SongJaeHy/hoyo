package com.damoyo.mapper;

import java.util.List;

import com.damoyo.domain.PhotoVO;
import com.damoyo.domain.PhotocategoryVO;



public interface PhotoMapper {
	
	// 사진 리스트
	public List<PhotocategoryVO> getList();
	
	// 사진 등록
	public void insert(PhotoVO vo);
	
	// 사진 번호 조회
	public PhotoVO select(int p_num);
	
	// 사진 삭제
	public void delete(int p_num);
	
	// 사진 수정
	public void update(PhotoVO vo);
}
