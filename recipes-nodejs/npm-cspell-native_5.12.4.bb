SUMMARY = "NPM: cspell"
DESCRIPTION = "A Spelling Checker for Code!"
HOMEPAGE = "https://streetsidesoftware.github.io/cspell/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-chalk-native \
           npm-commander-native \
           npm-comment-json-native \
           npm-cspell-gitignore-native \
           npm-cspell-glob-native \
           npm-cspell-lib-native \
           npm-fast-json-stable-stringify-native \
           npm-file-entry-cache-native \
           npm-fs-extra-native \
           npm-get-stdin-native \
           npm-glob-native \
           npm-imurmurhash-native \
           npm-strip-ansi-native \
           npm-vscode-uri-native"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.12.4.tgz"
SRC_URI[md5sum] = "e3ca63c49c64cfe0bfec8fab66ff00b9"
SRC_URI[sha256sum] = "a2f8341b29b862a80d04626badb4d2d286e386593a476fb7646e1e7cdeb4ef47"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native
