SUMMARY = "NPM: lru-cache"
DESCRIPTION = "A cache object that deletes the least-recently-used items."
HOMEPAGE = "https://github.com/isaacs/node-lru-cache#readme"

DEPENDS = "npm-pseudomap-native npm-yallist-native"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

SRC_URI = "https://registry.npmjs.org/lru-cache/-/lru-cache-4.1.5.tgz"
SRC_URI[md5sum] = "d99f84362a75fc342550160597315556"
SRC_URI[sha256sum] = "c9fd35da85117ae62cd4acaf30f0fadbab1abe3e5bfd890d78fd9e069c87abb9"

NPM_PKGNAME = "lru-cache"

inherit npmhelper
inherit native
