const cljsMain = require('./out/main.js');

function activate(context) {
    cljsMain.hello_world.core.activate(context);
}

function deactivate() {
    cljsMain.hello_world.core.deactivate();
}

module.exports = { activate, deactivate }
