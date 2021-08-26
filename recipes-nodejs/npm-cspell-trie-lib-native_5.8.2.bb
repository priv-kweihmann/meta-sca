SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.8.2.tgz"
SRC_URI[md5sum] = "303546403829bfaf30a2ddd52f8e4af8"
SRC_URI[sha256sum] = "30125fda3201eaa1b85fcce7c0bcd6426ed5cf679c0d638295357293486db60b"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native
