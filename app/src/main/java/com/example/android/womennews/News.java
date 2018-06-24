package com.example.android.womennews;

/**
 * An {@link News} object contains a single news feed.
 */
public class News {

    /**
     * News section name
     */
    private String mSectionName;

    /**
     * Publication date
     */
    private String mWebPublicationDate;

    /**
     * Title of the news
     */
    private String mWebTitle;

    /**
     * Author's name
     */
    private String mStoryAuthor;

    /**
     * Website URL of the news
     */
    private String mUrl;


    /**
     * Constructs a new {@link News} object.
     *
     * @param webTitle           is the title of the story
     * @param webPublicationDate is the date that the story was published on Guardian
     * @param sectionName        is the category in which the story was published
     * @param url                is the website URL to read the whole story on Guardian website
     * @param storyAuthor        is the first and last name of the story's author
     */

    public News(String sectionName, String webPublicationDate, String webTitle, String storyAuthor, String url) {
        mSectionName = sectionName;
        mWebPublicationDate = webPublicationDate;
        mWebTitle = webTitle;
        mStoryAuthor = storyAuthor;
        mUrl = url;
    }

    /**
     * Returns the title of the story.
     */
    public String getWebTitle() {
        return mWebTitle;
    }

    /**
     * Returns the publication date of the story.
     */
    public String getWebPublicationDate() {
        return mWebPublicationDate;
    }

    /**
     * Returns the section of the story.
     */
    public String getSectionName() {
        return mSectionName;
    }

    /**
     * Returns the website URL to read the whole story on Guardian website.
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     * Returns the first name of the news' author.
     */
    public String getStoryAuthor() {
        return mStoryAuthor;
    }
}