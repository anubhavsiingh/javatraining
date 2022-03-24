exports.config = {
    seleniumAddress: 'http://localhost:4444/wd/hub',
    specs: ['kitchen_test.js'],   
    directConnect : true,       //To connect directly to the browser driver
    capabilities :{
        browserName: 'chrome'
    },
    onPrepare: async () => {
        await browser.waitForAngularEnabled(false);
}
}