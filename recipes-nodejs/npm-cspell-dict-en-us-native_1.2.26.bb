SUMMARY = "NPM: cspell-dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_US#readme"

DEPENDS = "npm-configstore-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en_us/-/cspell-dict-en_us-1.2.26.tgz"
SRC_URI[md5sum] = "88e098f023f514f3497ccca1d1daa3a9"
SRC_URI[sha256sum] = "a14764cdc2dc52ff7e2452465bc557c4d08bef502f79f1b22db1492f6f8c49dd"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-dict-en_us"

inherit npmhelper
inherit native
