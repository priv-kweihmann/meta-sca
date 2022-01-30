SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-gitignore#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.17.0.tgz"
SRC_URI[md5sum] = "359ce3b3499a12d8b3acf816b26799e2"
SRC_URI[sha256sum] = "7f3b1bbaf0d17691d0f2853c68d2c171438fa867ed4c16d1df020f7868a2996b"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
