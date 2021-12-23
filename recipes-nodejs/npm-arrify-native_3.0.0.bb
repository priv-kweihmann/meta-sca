SUMMARY = "NPM: arrify"
DESCRIPTION = "Convert a value to an array"
HOMEPAGE = "https://github.com/sindresorhus/arrify#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/arrify/-/arrify-3.0.0.tgz"
SRC_URI[md5sum] = "5bce2df7ebfc403b64c5f4dded25d829"
SRC_URI[sha256sum] = "d0a5439fa9219d630333c3af7cb808213d284f2a8cb60f921ae7cedf5a1ce54e"

NPM_PKGNAME = "arrify"

inherit npmhelper
inherit native
