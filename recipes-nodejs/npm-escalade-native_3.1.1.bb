SUMMARY = "NPM: escalade"
DESCRIPTION = "A tiny (183B to 210B) and fast utility to ascend parent directories"
HOMEPAGE = "https://github.com/lukeed/escalade#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=1cb46128f91146188c0ded3a1c6144f3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/escalade/-/escalade-3.1.1.tgz"
SRC_URI[md5sum] = "61feaad8ca2ae37eff46aa4818a7b045"
SRC_URI[sha256sum] = "60f830428beb9022a2da1a31a41eef5aee4b27013f88d16535322b9a238ba79d"

NPM_PKGNAME = "escalade"

inherit npmhelper
inherit native
