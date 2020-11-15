SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-4.2.4.tgz"
SRC_URI[md5sum] = "1e8a858be6bcae14f0a81cf9f13e53e2"
SRC_URI[sha256sum] = "bf5acbbf9f76a337a17ef9ed66aab6cb4e09dffb8088a951a078601ea4ea05ef"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native
