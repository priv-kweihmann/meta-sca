SUMMARY = "NPM: quick-lru"
DESCRIPTION = "Simple "Least Recently Used" (LRU) cache"
HOMEPAGE = "https://github.com/sindresorhus/quick-lru#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/quick-lru/-/quick-lru-4.0.1.tgz"
SRC_URI[md5sum] = "ad48d9ff0ab15f8a791ae0aab485e05e"
SRC_URI[sha256sum] = "1c912d71fdcf7ac5d28af2fa70df36cf2b00dabb5fe719faead6eb201d7f4e2d"

NPM_PKGNAME = "quick-lru"

inherit npmhelper
inherit native
