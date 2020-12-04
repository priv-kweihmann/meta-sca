SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (108 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.1.20.tgz"
SRC_URI[md5sum] = "e86c622361b9de06b218ece14e4fba2c"
SRC_URI[sha256sum] = "ba26780b86fb8b9b235e9f519b778c45913fe76da12c74cba2ddfca8e87eddc7"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
