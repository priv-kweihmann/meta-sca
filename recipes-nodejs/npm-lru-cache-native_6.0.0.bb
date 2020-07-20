SUMMARY = "NPM: lru-cache"
DESCRIPTION = "A cache object that deletes the least-recently-used items."
HOMEPAGE = "https://github.com/isaacs/node-lru-cache#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = "npm-yallist-native"

SRC_URI = "https://registry.npmjs.org/lru-cache/-/lru-cache-6.0.0.tgz"
SRC_URI[md5sum] = "8c9af836bdae0050110801b42ef0a0aa"
SRC_URI[sha256sum] = "5ce40deb031cf6968f3832502a68f8d26be09764dc4f8fc07957a2fd7e8cdf5e"

NPM_PKGNAME = "lru-cache"

inherit npmhelper
inherit native
