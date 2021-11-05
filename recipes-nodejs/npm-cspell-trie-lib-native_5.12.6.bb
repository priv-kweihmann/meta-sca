SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.12.6.tgz"
SRC_URI[md5sum] = "51552dee1eda538976d01305eecd5aa0"
SRC_URI[sha256sum] = "f34384404f67c45681af6891558b48e16be23949fa287c500a70544825bfb0bb"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native
