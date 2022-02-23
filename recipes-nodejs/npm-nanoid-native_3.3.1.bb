SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (130 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.3.1.tgz"
SRC_URI[md5sum] = "1a27cf077cc40c51811677adab047a31"
SRC_URI[sha256sum] = "ad5542a3de899dbd0c2728a94b844ebb00794bb7762d3c1676de14de83f6135e"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
