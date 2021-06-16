SUMMARY = "NPM: cspell"
DESCRIPTION = "A Spelling Checker for Code!"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-chalk-native \
           npm-commander-native \
           npm-comment-json-native \
           npm-cspell-cspell-types-native \
           npm-cspell-glob-native \
           npm-cspell-lib-native \
           npm-fs-extra-native \
           npm-get-stdin-native \
           npm-glob-native \
           npm-strip-ansi-native \
           npm-vscode-uri-native"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.6.4.tgz"
SRC_URI[md5sum] = "6be892e605fd57dcb10d23fe754baf84"
SRC_URI[sha256sum] = "6aa1003fbddbc19e7257fb4c96861b6c8487d59bb6fdfedd2a99e9b26da4faac"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native
