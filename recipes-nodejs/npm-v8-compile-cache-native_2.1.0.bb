SUMMARY = "NPM: v8-compile-cache"
DESCRIPTION = "Require hook for automatic V8 compile cache persistence"
HOMEPAGE = "https://github.com/zertosh/v8-compile-cache#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dfd25c36f69a5eb33bd7338e42a726c8"

SRC_URI = "https://registry.npmjs.org/v8-compile-cache/-/v8-compile-cache-2.1.0.tgz"
SRC_URI[md5sum] = "4497c3958341feec4b4a2a1a372f227d"
SRC_URI[sha256sum] = "c3f682f7df5ceb7a6d2d09d2b4b8e02d7fe1faa1448c24d274e04e6390ef8658"

NPM_PKGNAME = "v8-compile-cache"

inherit npmhelper
inherit native
