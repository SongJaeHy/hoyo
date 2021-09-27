package com.damoyo.service;

import java.util.List;

import com.damoyo.domain.PhotoVO;
import com.damoyo.domain.PhotocategoryVO;


public interface PhotoService {
	
	// 사진 등록
	public void enrollment(PhotoVO vo);
	
	// 사진 조회
	public PhotoVO get(int p_num);
	
	// 사진 수정
	public void revise(PhotoVO vo);
	
	// 사진 삭제
	public void delete(PhotoVO vo);
	
	// 사진 리스트
	public List<PhotocategoryVO> getlist();
}
