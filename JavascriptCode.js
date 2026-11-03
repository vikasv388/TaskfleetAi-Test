
describe('YouTube Automation', () => {

    it('Search and play a YouTube video', async () => {

        // Open YouTube
        await browser.url('https://www.youtube.com');

        // Search video
        const searchBox = await $('input[name="search_query"]');
        await searchBox.setValue('JavaScript Tutorial');
        await browser.keys('Enter');

        // Wait for search results
        const firstVideo = await $('ytd-video-renderer a#video-title');
        await firstVideo.waitForClickable();
        await firstVideo.click();

        // Get title and URL
        const title = await browser.getTitle();
        const url = await browser.getUrl

        console.log('Video Title:', title);
        console.log('Video URL:', url);

    


