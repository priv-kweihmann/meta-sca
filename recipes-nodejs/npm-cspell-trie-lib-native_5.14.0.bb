SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.14.0.tgz"
SRC_URI[md5sum] = "7f5682cfbc92ae11fa723e1a18026e1e"
SRC_URI[sha256sum] = "7f331d5ce50ea3826f9e630689f181e585a59bcedfd8991080a67e8b94b043c0"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native
