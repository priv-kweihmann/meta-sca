SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-gitignore#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.15.2.tgz"
SRC_URI[md5sum] = "afda409b04b916182f41cc19951f450c"
SRC_URI[sha256sum] = "e97e99fb273bcd7c719db494c1ee74b5ed65a4debb8f716ead5c089b9724d96c"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
