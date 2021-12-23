SUMMARY = "NPM: quick-lru"
DESCRIPTION = "Simple “Least Recently Used” (LRU) cache"
HOMEPAGE = "https://github.com/sindresorhus/quick-lru#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/quick-lru/-/quick-lru-6.0.2.tgz"
SRC_URI[md5sum] = "707c7e0bcdf4a5d0832436ddff08450b"
SRC_URI[sha256sum] = "6ab3fdda61b5f4debdcc36c3c583042ad00d8e4c75dcc4ed28b184d57f1ed6e7"

NPM_PKGNAME = "quick-lru"

inherit npmhelper
inherit native
