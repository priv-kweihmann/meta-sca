SUMMARY = "NPM: quick-lru"
DESCRIPTION = "Simple “Least Recently Used” (LRU) cache"
HOMEPAGE = "https://github.com/sindresorhus/quick-lru#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/quick-lru/-/quick-lru-6.1.1.tgz"
SRC_URI[md5sum] = "9310138417058bdc5586cd6366b50367"
SRC_URI[sha256sum] = "3e97dee8d1453255f9e399db4784636a2dce21a14f420903a51621d171f1e53d"

NPM_PKGNAME = "quick-lru"

inherit npmhelper
inherit native
