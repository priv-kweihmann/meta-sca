SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-gitignore#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.15.1.tgz"
SRC_URI[md5sum] = "6b97b242b48b2fd52ac16d467c22310f"
SRC_URI[sha256sum] = "5f4d156b7e3f828470eac2ca024ba1a540338dbbf2b54f47fc7ef279d30a75cf"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
