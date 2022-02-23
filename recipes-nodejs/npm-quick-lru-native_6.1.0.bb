SUMMARY = "NPM: quick-lru"
DESCRIPTION = "Simple “Least Recently Used” (LRU) cache"
HOMEPAGE = "https://github.com/sindresorhus/quick-lru#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/quick-lru/-/quick-lru-6.1.0.tgz"
SRC_URI[md5sum] = "37230a3aa8a06596f00f46a17ecdeb3f"
SRC_URI[sha256sum] = "0efc4205bfe5b08ee6f365b29e3ed4dff3891ba9d5a2027f2be1c1ef60660d8e"

NPM_PKGNAME = "quick-lru"

inherit npmhelper
inherit native
