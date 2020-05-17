SUMMARY = "NPM: concat-map"
DESCRIPTION = "concatenative mapdashery"
HOMEPAGE = "https://github.com/substack/node-concat-map"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1"

SRC_URI = "https://registry.npmjs.org/concat-map/-/concat-map-0.0.1.tgz"
SRC_URI[md5sum] = "d11d2d19ce6c3d9326cb3e987e8bcd23"
SRC_URI[sha256sum] = "35902dd620cf0058c49ea614120f18a889d984269a90381b7622e79c2cfe4261"

S = "${WORKDIR}/package"

NPM_PKGNAME = "concat-map"

inherit npmhelper
inherit native
