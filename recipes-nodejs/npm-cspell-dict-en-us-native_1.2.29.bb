SUMMARY = "NPM: cspell-dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en_us/-/cspell-dict-en_us-1.2.29.tgz"
SRC_URI[md5sum] = "7aa980c525627b388a5a115ac7fa62a7"
SRC_URI[sha256sum] = "9470727ec0b27d1021719bc0308e3717a58329edc572baf692918062895e8122"

NPM_PKGNAME = "cspell-dict-en_us"

inherit npmhelper
inherit native
