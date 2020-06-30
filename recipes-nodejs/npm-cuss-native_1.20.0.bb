SUMMARY = "NPM: cuss"
DESCRIPTION = "Map of English profane words to a rating of sureness"
HOMEPAGE = "https://github.com/words/cuss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cuss/-/cuss-1.20.0.tgz"
SRC_URI[md5sum] = "fb2af75bb121498478856d1db705b127"
SRC_URI[sha256sum] = "3aa37af58abb05951a13ea650aeb970739ee93462f8e3fce174eda7ae3eca10f"

NPM_PKGNAME = "cuss"

inherit npmhelper
inherit native
