SUMMARY = "NPM: v8-compile-cache"
DESCRIPTION = "Require hook for automatic V8 compile cache persistence"
HOMEPAGE = "https://github.com/zertosh/v8-compile-cache#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dfd25c36f69a5eb33bd7338e42a726c8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/v8-compile-cache/-/v8-compile-cache-2.2.0.tgz"
SRC_URI[md5sum] = "8b39c0ca23072d9bafa195d17fb255d2"
SRC_URI[sha256sum] = "ba2ba2368066f58c1b996a85a39c823ef64e0f9d890c66eb4931c6fafa8e3192"

NPM_PKGNAME = "v8-compile-cache"

inherit npmhelper
inherit native
