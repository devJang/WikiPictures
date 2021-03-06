package org.kosta.wikipictures.dao;

import java.util.HashMap;
import java.util.List;

import org.kosta.wikipictures.vo.HashtagVO;
import org.kosta.wikipictures.vo.MypageVO;
import org.kosta.wikipictures.vo.PictureVO;
import org.kosta.wikipictures.vo.ReportVO;
import org.kosta.wikipictures.vo.TimeMachineVO;

public interface PictureDAO {

	void registerHashtag(List<HashtagVO> hashtagList);

	void registerPicture(PictureVO pictureVO);

	List<PictureVO> getPictures();

	List<PictureVO> searchPicture(String keyword);

	List<PictureVO> searchHashtag(String keyword);

	PictureVO picture(PictureVO pictureVO);

	List<HashtagVO> searchDetailPicture(HashtagVO hashtagVO);

	PictureVO reportForm(PictureVO pictureVO);

	int report(ReportVO rvo);

	void addHashtag(HashtagVO hashtagVO);

	List<TimeMachineVO> getTimeMachineList();

	List<PictureVO> getAccidentPictureList(String timeMachineYear);

	List<PictureVO> getPersonAndLocationPictureList(String timeMachineYear);

	List<PictureVO> showMypictureList(HashMap<String, String> paramMap);

	int totalContentCount(String string);

	List<MypageVO> showSecretreplyList(HashMap<String, String> paramMap);

	int secretTotalContentCount(String string);

	List<MypageVO> showBuyList(HashMap<String, String> paramMap);

	int buyTotalContentCount(String string);

	void updateAuthorComment(PictureVO pictureVO);

	MypageVO getMypageVO(MypageVO mypageVO);

	void registerSecretReply(MypageVO mypageVO);

}
