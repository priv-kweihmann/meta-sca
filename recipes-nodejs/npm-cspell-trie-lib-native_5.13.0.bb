SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.13.0.tgz"
SRC_URI[md5sum] = "3ea27c8f7c1f27969edd44108af4aa16"
SRC_URI[sha256sum] = "9d69cef4c1fe7c0232330a3d354f98007d8b6f6abdb2ecb605e60b999b9b2341"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native
