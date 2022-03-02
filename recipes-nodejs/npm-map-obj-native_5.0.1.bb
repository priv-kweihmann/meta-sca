SUMMARY = "NPM: map-obj"
DESCRIPTION = "Map object keys and values into a new object"
HOMEPAGE = "https://github.com/sindresorhus/map-obj#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/map-obj/-/map-obj-5.0.1.tgz"
SRC_URI[md5sum] = "9d03d1de898f4413adee900662bf5e0e"
SRC_URI[sha256sum] = "1a771532b13f706936b39d3a8709b46d69ac6ded943da183ae0dcec4bfae43b4"

NPM_PKGNAME = "map-obj"

inherit npmhelper
inherit native
