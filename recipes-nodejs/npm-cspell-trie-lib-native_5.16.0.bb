SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.16.0.tgz"
SRC_URI[md5sum] = "e826cc38c76cab576427fd9d22ccec5f"
SRC_URI[sha256sum] = "36fbfeaead765f29507253dd59350763affcddb6cb0d8db12efd9c9e44f97a6f"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native
