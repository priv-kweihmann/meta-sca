SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.12.0.tgz"
SRC_URI[md5sum] = "5de68352b77370514d0ec2d69aa8cf28"
SRC_URI[sha256sum] = "e982386b469e707568f2988fdf876ba672a770357acf541955f00a150056050a"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native
