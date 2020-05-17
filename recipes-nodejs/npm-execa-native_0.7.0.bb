SUMMARY = "NPM: execa"
DESCRIPTION = "A better `child_process`"
HOMEPAGE = "https://github.com/sindresorhus/execa#readme"

DEPENDS = "npm-cross-spawn-native npm-get-stream-native npm-is-stream-native npm-npm-run-path-native npm-p-finally-native npm-signal-exit-native npm-strip-eof-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/execa/-/execa-0.7.0.tgz"
SRC_URI[md5sum] = "c4f9368a6bc3c196a83f5f7809b5bb13"
SRC_URI[sha256sum] = "da8b373ec5ee3e58795a5f12762d839c883e1f88c58b5826b190be1449375c16"

NPM_PKGNAME = "execa"

inherit npmhelper
inherit native
