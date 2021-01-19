SUMMARY = "NPM: quick-lru"
DESCRIPTION = "Simple “Least Recently Used” (LRU) cache"
HOMEPAGE = "https://github.com/sindresorhus/quick-lru#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/quick-lru/-/quick-lru-6.0.0.tgz"
SRC_URI[md5sum] = "b6c35b1737d213475d4546741d93a97b"
SRC_URI[sha256sum] = "a96b1460c5410ce5261113be3bd2ddc42d9ecfdd001bb72396220deb2b3aab44"

NPM_PKGNAME = "quick-lru"

inherit npmhelper
inherit native
