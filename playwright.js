const { test, expect } = require('@playwright/test');

test('login test', async ({ page }) => {
  // Open website
  await page.goto('https://example.com');

  // Check page title
  await expect(page).toHaveTitle(/Example/);

  // Example form interactions
  await page.locator('#username').fill('testuser');
  await page.locator('#password').fill('password123');

  // Click login
  await page.locator('button[type="submit"]').click();

  // Verify result
  await expect(page.locator('.dashboard')).toBeVisible();
});
