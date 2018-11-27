package com.jwl.bean.autoconfig;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)    // 该注解被告知需要在 CDPlayerConfig 中加载配置
public class CDPlayerTest {

    @Rule
    // 该类来源于System Rules 库的一个Junit规则，该规则能够基于控制台的输出编写断言
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        // 断言，判断该参数是否为null，如为null则报错，否则不报错
        assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
        // 断言，判断两个字符串是否相等
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles",log.getLog());
    }

}
