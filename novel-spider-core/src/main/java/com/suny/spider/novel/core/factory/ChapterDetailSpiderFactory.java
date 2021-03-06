package com.suny.spider.novel.core.factory;

import com.suny.spider.novel.core.enums.NovelSiteEnum;
import com.suny.spider.novel.core.impl.chapter.DefaultChapterDetailSpider;
import com.suny.spider.novel.core.interfaces.IChapterDetailSpider;

/**
 * 章节内容爬虫的工厂代理类
 *
 * @author sunjianrong
 * @date 2017/02/21 22:24
 */
public final class ChapterDetailSpiderFactory {
    private ChapterDetailSpiderFactory() {
    }

    /**
     * 根据指定的url拿到实现IChapterDetailSpider的实现类
     *
     * @param url 小说所对应的url地址
     * @return
     */
    public static IChapterDetailSpider getChapterDetailSpider(String url) {
        IChapterDetailSpider spider;
        NovelSiteEnum novelSiteEnum = NovelSiteEnum.getEnumByUrl(url);
        switch (novelSiteEnum) {
            case DingDianXiaoShuo:
            case BiQuGe:
            case KanShuZhong:
            case Bxwx:
            default:
                spider = new DefaultChapterDetailSpider();
                break;
        }
        return spider;
    }

}
