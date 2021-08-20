SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.7.0.tgz"
SRC_URI[md5sum] = "d8a6c227e14e200be5768fc589de2df4"
SRC_URI[sha256sum] = "e631d33c47251488d852699f6195eaecc17504e078324bfac212fbfccf629381"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native
