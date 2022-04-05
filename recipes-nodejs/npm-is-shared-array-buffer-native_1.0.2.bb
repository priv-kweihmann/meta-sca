SUMMARY = "NPM: is-shared-array-buffer"
DESCRIPTION = "Is this value a JS SharedArrayBuffer?"
HOMEPAGE = "https://github.com/inspect-js/is-shared-array-buffer#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a026b78b6909aa5e21d77709fb6b5156"

DEPENDS = "npm-call-bind-native"

SRC_URI = "https://registry.npmjs.org/is-shared-array-buffer/-/is-shared-array-buffer-1.0.2.tgz"
SRC_URI[md5sum] = "478da999f49b20d86406f760d98af885"
SRC_URI[sha256sum] = "1fe57e0f2a80050e5b0c2d1fed9eec189c1a7650bfb2f6cb800537929961fa90"

NPM_PKGNAME = "is-shared-array-buffer"

inherit npmhelper
inherit native
