require('./out/goog/bootstrap/nodejs')
require('./out/main');
goog.require('hello_world.core');

function activate(context) {
    hello_world.core.activate(context);
}

function deactivate() {
    hello_world.core.deactivate();
}

module.exports = { activate, deactivate }
