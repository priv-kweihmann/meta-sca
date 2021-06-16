SUMMARY = "NPM: cuss"
DESCRIPTION = "Map of English profane words to a rating of sureness"
HOMEPAGE = "https://github.com/words/cuss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cuss/-/cuss-2.0.0.tgz"
SRC_URI[md5sum] = "39e9828f408cdcf46765c82283e7a598"
SRC_URI[sha256sum] = "d7c21b24e682dd1cfdd226382d023f27a902cd3b40c6957c22499879923ea74e"

NPM_PKGNAME = "cuss"

inherit npmhelper
inherit native
