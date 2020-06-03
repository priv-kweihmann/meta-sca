SUMMARY = "NPM: quick-lru"
DESCRIPTION = "Simple “Least Recently Used” (LRU) cache"
HOMEPAGE = "https://github.com/sindresorhus/quick-lru#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/quick-lru/-/quick-lru-5.1.1.tgz"
SRC_URI[md5sum] = "cb75bde3247ae33ce36f2423f75b92ee"
SRC_URI[sha256sum] = "b9835884a209a28d4fdcf9cddabceaf3520b935417afee88137ca2eeed7b35df"

NPM_PKGNAME = "quick-lru"

inherit npmhelper
inherit native
