package org.kosta.wikipictures.dao;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.kosta.wikipictures.vo.HashtagVO;
import org.kosta.wikipictures.vo.MypageVO;
import org.kosta.wikipictures.vo.PictureVO;
import org.kosta.wikipictures.vo.ReportVO;
import org.kosta.wikipictures.vo.TimeMachineVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PictureDAOImpl implements PictureDAO {

	@Resource
	private SqlSessionTemplate template;

	@Override
	public void registerHashtag(List<HashtagVO> hashtagList) {
		/* System.out.println(hashtagList); */
		for (HashtagVO hvo : hashtagList)
			template.insert("picture.registerHashtag", hvo);
	}

	@Override
	public void addHashtag(HashtagVO hashtagVO) {
		template.insert("picture.addHashtag", hashtagVO);
	}

	@Override
	public void registerPicture(PictureVO pictureVO) {
		template.insert("picture.registerPicture", pictureVO);
	}

	@Override
	public List<PictureVO> getPictures() {
		return template.selectList("picture.getPictures");
	}

	@Override
	public List<PictureVO> searchPicture(String keyword) {
		return template.selectList("picture.searchPicture", keyword);
	}

	public List<PictureVO> searchHashtag(String keyword) {
		return template.selectList("picture.searchHashtag", keyword);
	}

	@Override
	public PictureVO picture(PictureVO pictureVO) {
		return template.selectOne("picture.picture", pictureVO);
	}

	@Override
	public List<HashtagVO> searchDetailPicture(HashtagVO hashtagVO) {
		return template.selectList("picture.searchDetailPicture", hashtagVO);
	}

	@Override
	public List<TimeMachineVO> getTimeMachineList() {
		return template.selectList("picture.getTimeMachineList");
	}

	@Override
	public List<PictureVO> getAccidentPictureList(String timeMachineYear) {
		return template.selectList("picture.getAccidentPictureList", timeMachineYear);
	}

	@Override
	public List<PictureVO> getPersonAndLocationPictureList(String timeMachineYear) {
		return template.selectList("picture.getPersonAndLocationPictureList", timeMachineYear);
	}

	@Override
	public List<PictureVO> showMypictureList(HashMap<String, String> paramMap) {
		return template.selectList("picture.showMypictureList", paramMap);
	}

	@Override
	public int totalContentCount(String string) {
		return template.selectOne("picture.totalContentCount", string);
	}

	@Override
	public List<MypageVO> showSecretreplyList(HashMap<String, String> paramMap) {
		return template.selectList("picture.showSecretreplyList", paramMap);
	}

	@Override
	public int secretTotalContentCount(String string) {
		return template.selectOne("picture.secretTotalContentCount", string);
	}

	@Override
	public List<MypageVO> showBuyList(HashMap<String, String> paramMap) {
		return template.selectList("picture.showBuyList", paramMap);
	}

	@Override
	public int buyTotalContentCount(String string) {
		return template.selectOne("picture.buyTotalContentCount", string);
	}

	@Override
	public void updateAuthorComment(PictureVO pictureVO) {
		template.update("picture.updateAuthorComment", pictureVO);
	}

	@Override
	public MypageVO getMypageVO(MypageVO mypageVO) {
		return template.selectOne("picture.getMypageVO", mypageVO);
	}

	@Override
	public void registerSecretReply(MypageVO mypageVO) {
		template.insert("picture.registerSecretReply", mypageVO);
	}

	@Override
	public PictureVO reportForm(PictureVO pictureVO) {
		return template.selectOne("picture.reportForm", pictureVO);
	}

	@Override
	public int report(ReportVO rvo) {
		return template.insert("picture.report", rvo);
	}
}