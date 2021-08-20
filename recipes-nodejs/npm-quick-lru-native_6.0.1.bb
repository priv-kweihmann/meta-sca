SUMMARY = "NPM: quick-lru"
DESCRIPTION = "Simple “Least Recently Used” (LRU) cache"
HOMEPAGE = "https://github.com/sindresorhus/quick-lru#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/quick-lru/-/quick-lru-6.0.1.tgz"
SRC_URI[md5sum] = "821f1a1585429801beb4a543cf1b3f49"
SRC_URI[sha256sum] = "52f890cedd37b1bbba3e023725bb828489fb2a58dc762383604cba098cf5382c"

NPM_PKGNAME = "quick-lru"

inherit npmhelper
inherit native
