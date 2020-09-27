SUMMARY = "NPM: sugarss"
DESCRIPTION = "Indent-based CSS syntax for PostCSS"
HOMEPAGE = "https://github.com/postcss/sugarss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4134d402e7331fd1e7d9f294aa26def4"

DEPENDS = "npm-postcss-native"

SRC_URI = "https://registry.npmjs.org/sugarss/-/sugarss-3.0.1.tgz"
SRC_URI[md5sum] = "a22546d34454b3ea04d45a143f3b1e2e"
SRC_URI[sha256sum] = "976f2580fcc353c8b90250e2a3e6ff73ccd9c76a628615429c196788a717188f"

NPM_PKGNAME = "sugarss"

inherit npmhelper
inherit native
