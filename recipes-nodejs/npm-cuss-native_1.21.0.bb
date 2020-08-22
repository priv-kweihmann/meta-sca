SUMMARY = "NPM: cuss"
DESCRIPTION = "Map of English profane words to a rating of sureness"
HOMEPAGE = "https://github.com/words/cuss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cuss/-/cuss-1.21.0.tgz"
SRC_URI[md5sum] = "e74ada3e3642c7fdf2bc5fa10a2e183e"
SRC_URI[sha256sum] = "a25dfc6684be46bb98b7085e77585df94a6e9b66cad7ea68c87a6a6c712906ee"

NPM_PKGNAME = "cuss"

inherit npmhelper
inherit native
