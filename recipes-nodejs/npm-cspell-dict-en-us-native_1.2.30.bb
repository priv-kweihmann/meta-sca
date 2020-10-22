SUMMARY = "NPM: cspell-dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en_us/-/cspell-dict-en_us-1.2.30.tgz"
SRC_URI[md5sum] = "d28437df191cdf0bc9fb89e2b9cf9108"
SRC_URI[sha256sum] = "2503b77c0c8ac5c43038a509ebedf8e1e4879eb1d9af7842421d7c56862edb51"

NPM_PKGNAME = "cspell-dict-en_us"

inherit npmhelper
inherit native
