SUMMARY = "NPM: map-like"
DESCRIPTION = "ECMAScript Map like object."
HOMEPAGE = "https://github.com/azu/map-like"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

SRC_URI = "https://registry.npmjs.org/map-like/-/map-like-2.0.0.tgz"
SRC_URI[md5sum] = "1c049ade37742b1b070156a0c615a771"
SRC_URI[sha256sum] = "9fec2e8806dfb328ce02df302981a928343ef52d54dd40733db729a2f6dd300a"

NPM_PKGNAME = "map-like"

inherit npmhelper
inherit native
