SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-gitignore#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.12.3.tgz"
SRC_URI[md5sum] = "2d99fc44329eaf82eac362449569a8d2"
SRC_URI[sha256sum] = "06cb26b6e7eefe9cb46a7d66776685193b03e302c49b0217677f60372d05e707"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
