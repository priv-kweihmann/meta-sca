SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-gitignore#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.14.0.tgz"
SRC_URI[md5sum] = "de5e926c3ca054aaef79f65759a3c446"
SRC_URI[sha256sum] = "f3c564329dd99c2acb969ab9a0228af2d5a03c97fbcd2d96368a246eeba835fe"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
