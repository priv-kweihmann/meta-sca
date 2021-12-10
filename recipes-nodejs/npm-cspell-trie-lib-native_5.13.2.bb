SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.13.2.tgz"
SRC_URI[md5sum] = "24fc3c1644170af684dd33627396daa9"
SRC_URI[sha256sum] = "9258328cc12be38fcc1959da1abf2009b77f7215374ccddfe3a89970ba2ba669"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native
