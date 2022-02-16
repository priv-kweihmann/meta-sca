SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (130 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.3.0.tgz"
SRC_URI[md5sum] = "7a439795683332be8be7ed4ef360b45b"
SRC_URI[sha256sum] = "e03e1c0a6637b8bb2822e10767440108e80c848335514fce1cf45ccb5c4163b0"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
