SUMMARY = "NPM: lru-cache"
DESCRIPTION = "A cache object that deletes the least-recently-used items."
HOMEPAGE = "https://github.com/isaacs/node-lru-cache#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = "npm-yallist-native"

SRC_URI = "https://registry.npmjs.org/lru-cache/-/lru-cache-5.1.1.tgz"
SRC_URI[md5sum] = "23d45c423c7ae2a1bdd6d9f360e048ad"
SRC_URI[sha256sum] = "b11e78819544a6606e3317647a5593c102ea38d3c5afae62cd63f9c2c369485a"

NPM_PKGNAME = "lru-cache"

inherit npmhelper
inherit native
