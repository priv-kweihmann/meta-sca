SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-gitignore#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.19.2.tgz"
SRC_URI[md5sum] = "1c6b171c708ea628eb2075d015879b58"
SRC_URI[sha256sum] = "3c59de66c05fe0530eaa574e5683f672b62881d50f4bdb1304feeca306867646"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
