SUMMARY = "NPM: map-obj"
DESCRIPTION = "Map object keys and values into a new object"
HOMEPAGE = "https://github.com/sindresorhus/map-obj#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/map-obj/-/map-obj-5.0.0.tgz"
SRC_URI[md5sum] = "3547247a57f5fa65edb108331ebbe60a"
SRC_URI[sha256sum] = "fd11bf4b963a59d32492c501156a774bbabf503b8286ce9ee5e113aa34e6ebc1"

NPM_PKGNAME = "map-obj"

inherit npmhelper
inherit native
