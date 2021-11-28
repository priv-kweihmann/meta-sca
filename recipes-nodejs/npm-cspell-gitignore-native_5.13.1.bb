SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-gitignore#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.13.1.tgz"
SRC_URI[md5sum] = "d63427bf83cc6521ed719447d9f04604"
SRC_URI[sha256sum] = "c8892ae4c81104e7cf96239202bcd88736170bafe1f91f15ef4ee6f7d8d73c2f"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
