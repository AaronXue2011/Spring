package com.jwl.bean.autoconfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // 组件
public class CDPlayer implements MediaPlayer {
	// 媒体播放器，用CD来实现播放
	private CompactDisc cd;

	@Autowired  // 自动装配
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}

}
