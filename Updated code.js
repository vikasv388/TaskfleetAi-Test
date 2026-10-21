
describe('Handle a Web Page', () => {

    it('should interact with webpage elements', async () => {

        // 1. Open website
        await browser.url('https://www.google.com');

        // 2. Maximize browser window
        await browser.maximizeWindow();

        // 3. Get page title
        const title = await browser.getTitle();
        console.log('Page Title:', title);

        // 4. Locate search box
        const searchBox = await $('textarea[name="q"]');

        // 5. Enter text
        await searchBox.setValue('WebdriverIO tutorial');

        // 6. Submit search
        await searchBox.press('Enter');

        // 7. Wait for page to load
        await browser.waitUntil(
            async () => (await browser.getUrl()).includes('search'),
            {
                timeout: 10000,
                timeoutMsg: 'Search page did not load'
            }
        );

        // 8. Get current URL
        const currentUrl = await browser.getUrl();
        console.log('Current URL:', currentUrl);

        // 9. Validate page title
        await expect(browser).toHaveTitle(
            expect.stringContaining('WebdriverIO tutorial')
        );

        // 10. Navigate back
        await browser.back();

        // 11. Refresh page
        await browser.refresh();

    });
});
