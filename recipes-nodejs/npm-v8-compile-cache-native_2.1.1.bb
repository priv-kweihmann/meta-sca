SUMMARY = "NPM: v8-compile-cache"
DESCRIPTION = "Require hook for automatic V8 compile cache persistence"
HOMEPAGE = "https://github.com/zertosh/v8-compile-cache#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dfd25c36f69a5eb33bd7338e42a726c8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/v8-compile-cache/-/v8-compile-cache-2.1.1.tgz"
SRC_URI[md5sum] = "e6a923d1dd958987dc7f2167430f98c4"
SRC_URI[sha256sum] = "b5fdf5705f9f67ff9c24860142b4300fb3b6326843a9cba1bd2aad7653ff8e25"

NPM_PKGNAME = "v8-compile-cache"

inherit npmhelper
inherit native
