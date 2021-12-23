SUMMARY = "NPM: is-shared-array-buffer"
DESCRIPTION = "Is this value a JS SharedArrayBuffer?"
HOMEPAGE = "https://github.com/inspect-js/is-shared-array-buffer#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a026b78b6909aa5e21d77709fb6b5156"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-shared-array-buffer/-/is-shared-array-buffer-1.0.1.tgz"
SRC_URI[md5sum] = "262a0c4a277cb35dc227ce4a0f552be1"
SRC_URI[sha256sum] = "14b35068e9505161afce57efbd849b33c519d4524f4b2548587d017e51d25897"

NPM_PKGNAME = "is-shared-array-buffer"

inherit npmhelper
inherit native
