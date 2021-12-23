SUMMARY = "NPM: minimist"
DESCRIPTION = "parse argument options"
HOMEPAGE = "https://github.com/substack/minimist"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1"

SRC_URI = "https://registry.npmjs.org/minimist/-/minimist-1.2.5.tgz"
SRC_URI[md5sum] = "522d37fe79e519d03574fd979abd7e4f"
SRC_URI[sha256sum] = "a1800ce4d39356e96497bd09a41fad0033a13dd8eeb469008333547505ce4350"

NPM_PKGNAME = "minimist"

inherit npmhelper
inherit native
