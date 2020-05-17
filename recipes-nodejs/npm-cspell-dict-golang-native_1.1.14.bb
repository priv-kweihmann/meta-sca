SUMMARY = "NPM: cspell-dict-golang"
DESCRIPTION = "Go Language dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/golang#readme"

DEPENDS = "npm-configstore-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

SRC_URI = "https://registry.npmjs.org/cspell-dict-golang/-/cspell-dict-golang-1.1.14.tgz"
SRC_URI[md5sum] = "c654b1787728a5e7ed5338a52949ddf0"
SRC_URI[sha256sum] = "a96a08b9360619f802831a916b4a53e29084c2caf0d63382f875c0b55b9914df"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-dict-golang"

inherit npmhelper
inherit native
