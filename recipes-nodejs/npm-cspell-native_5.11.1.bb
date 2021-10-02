SUMMARY = "NPM: cspell"
DESCRIPTION = "A Spelling Checker for Code!"
HOMEPAGE = "https://streetsidesoftware.github.io/cspell/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-chalk-native \
           npm-commander-native \
           npm-comment-json-native \
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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.11.1.tgz"
SRC_URI[md5sum] = "06721479aff42586ae7947dc96c0cc81"
SRC_URI[sha256sum] = "c78b0ccd8db86575e91a7531b328f33b4e2cac70b62a2035385484432b2561f6"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native
