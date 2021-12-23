SUMMARY = "NPM: is-typedarray"
DESCRIPTION = "Detect whether or not an object is a Typed Array"
HOMEPAGE = "https://github.com/hughsk/is-typedarray"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=aea1cde69645f4b99be4ff7ca9abcce1"

SRC_URI = "https://registry.npmjs.org/is-typedarray/-/is-typedarray-1.0.0.tgz"
SRC_URI[md5sum] = "d5efec2afc8b29ff367a2127cd1890b2"
SRC_URI[sha256sum] = "0d5c97ab733832aa006929b933decd71af74d92dcc857637840cb47496c83845"

S = "${WORKDIR}/package"

NPM_PKGNAME = "is-typedarray"

inherit npmhelper
inherit native
