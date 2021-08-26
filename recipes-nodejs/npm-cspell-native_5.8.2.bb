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
           npm-fs-extra-native \
           npm-get-stdin-native \
           npm-glob-native \
           npm-strip-ansi-native \
           npm-vscode-uri-native"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.8.2.tgz"
SRC_URI[md5sum] = "68589778001dee3000bd54b9021342a6"
SRC_URI[sha256sum] = "91157914ed7117f1e65e41f87e4bd8852d9fe71b8bf2c9e228b47794df320552"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native
