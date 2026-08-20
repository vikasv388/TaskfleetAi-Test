const { expect } = require('@wdio/globals');

describe('WebdriverIO Search Test', () => {

    it('should search and verify results', async () => {

        // Open website
        await browser.url('https://example.com');

        // Verify page
        await expect(browser).toHaveTitleContaining('Example');

        // Find search box
        const searchBox = await $('#search');

        // Wait until search box is visible
        await searchBox.waitForDisplayed({
            timeout: 10000
        });

        // Enter search text
        await searchBox.setValue('Laptop');

        // Click search button
        const searchButton = await $('#searchButton');

        await searchButton.waitForClickable({
            timeout: 10000
        });

        await searchButton.click();

        // Wait for results
        await browser.waitUntil(
            async () => {
                const results = await $$('.search-result');
                return results.length > 0;
            },
            {
                timeout: 10000,
                timeoutMsg: 'Search results not found'
            }
        );

        // Get all results
        const results = await $$('.search-result');

        // Verify results
        expect(results.length).toBeGreaterThan(0);

        console.log('Total Results:', results.length);

        // Print result names
        for (let i = 0; i < results.length; i++) {

            const resultName = await results[i]
                .$('.result-title')
                .getText();

            console.log(
                `Result ${i + 1}: ${resultName}`
            );
        }

        // Verify search URL
        await expect(browser).toHaveUrl(
            expect.stringContaining('search')
        );

        // Take screenshot
        await browser.saveScreenshot(
            './screenshots/search-result.png'
        );

        console.log('Search test passed successfully');
    });
});
