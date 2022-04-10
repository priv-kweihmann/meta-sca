SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-gitignore#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.19.7.tgz"
SRC_URI[md5sum] = "501243c7afd2f72d780332109621ce0b"
SRC_URI[sha256sum] = "40bb5319fd567bcdd37e72d28b86a3864e872ce2e39463df875a06bdf529ef28"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
