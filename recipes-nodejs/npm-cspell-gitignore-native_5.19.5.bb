SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-gitignore#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.19.5.tgz"
SRC_URI[md5sum] = "7cdbfa990ae63e06d555e32ce23ee2ef"
SRC_URI[sha256sum] = "814600ef3b2f7aea6844f56b4893ada6048a64474c94f34b9ab5996db24b82f1"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
