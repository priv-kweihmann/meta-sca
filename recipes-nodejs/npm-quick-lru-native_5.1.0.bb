SUMMARY = "NPM: quick-lru"
DESCRIPTION = "Simple “Least Recently Used” (LRU) cache"
HOMEPAGE = "https://github.com/sindresorhus/quick-lru#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/quick-lru/-/quick-lru-5.1.0.tgz"
SRC_URI[md5sum] = "844675d422f72db57b5dcd9508591915"
SRC_URI[sha256sum] = "ff3ea76971554a8a83899b8bc928b90d3be37b095ab17b6bcf2d4deef97e1e2a"

NPM_PKGNAME = "quick-lru"

inherit npmhelper
inherit native
