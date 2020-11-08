SUMMARY = "NPM: sugarss"
DESCRIPTION = "Indent-based CSS syntax for PostCSS"
HOMEPAGE = "https://github.com/postcss/sugarss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4134d402e7331fd1e7d9f294aa26def4"

DEPENDS = "npm-postcss-native"

SRC_URI = "https://registry.npmjs.org/sugarss/-/sugarss-3.0.3.tgz"
SRC_URI[md5sum] = "e1f3c101c8b38f87d3c401c16f2d30cd"
SRC_URI[sha256sum] = "f2deae284f842e3bfa60dac79a566376ea9c15df6ed789e0c7a86c7173fe6c08"

NPM_PKGNAME = "sugarss"

inherit npmhelper
inherit native
