SUMMARY = "NPM: agent-base"
DESCRIPTION = "Turn a function into an `http.Agent` instance"
HOMEPAGE = "https://github.com/TooTallNate/node-agent-base#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=120;md5=b0b8c014cd7a5f51ad9564f75c0b4432"

DEPENDS = "npm-debug-native"

SRC_URI = "https://registry.npmjs.org/agent-base/-/agent-base-6.0.1.tgz"
SRC_URI[md5sum] = "cbd5ca99acf405c88dbb813a8368aabc"
SRC_URI[sha256sum] = "20b13b9ea109729bbd889514b61b392c7e608b5feb3d4016c503ed5df0a1f747"

NPM_PKGNAME = "agent-base"

inherit npmhelper
inherit native
