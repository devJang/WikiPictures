package org.kosta.wikipictures.service;

import java.util.List;

import javax.annotation.Resource;

import org.kosta.wikipictures.dao.PictureDAO;
import org.kosta.wikipictures.vo.HashtagVO;
import org.kosta.wikipictures.vo.PictureVO;
import org.springframework.stereotype.Service;

@Service
public class PictureServiceImpl implements PictureService {
	
	@Resource
	private PictureDAO pictureDAO;

	@Override
	public void registerHashtag(List<HashtagVO> hashtagList) {
		pictureDAO.registerHashtag(hashtagList);
	}

	@Override
	public void registerPicture(PictureVO pictureVO) {
		pictureDAO.registerPicture(pictureVO);
	}
	
	@Override
	public List<PictureVO> searchPicture(String keyword){
		return pictureDAO.searchPicture(keyword);
	}
	@Override
	public PictureVO picture(PictureVO pictureVO){
		return pictureDAO.picture(pictureVO);
	}
	@Override
	public List<HashtagVO> searchDetailPicture(HashtagVO hashtagVO){
		return pictureDAO.searchDetailPicture(hashtagVO);
	}
	
	
}
