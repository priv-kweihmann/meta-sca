SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-gitignore#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.12.4.tgz"
SRC_URI[md5sum] = "9cd298c6e9aeada26f3067ba08252780"
SRC_URI[sha256sum] = "29bf915a5c07ec1ccb59f34662136dc6ea1bd8ef579bb73f08e02e72ec1a1c4d"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
