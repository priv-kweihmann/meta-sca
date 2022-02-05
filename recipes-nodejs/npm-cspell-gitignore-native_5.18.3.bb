SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-gitignore#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.18.3.tgz"
SRC_URI[md5sum] = "8a637c82ba5f971438a4285093dcce3e"
SRC_URI[sha256sum] = "35292bce5d61ba5ac55226203ac6215d18a6bc7e6fa1ea610322cb153d2f042e"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
