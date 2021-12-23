SUMMARY = "NPM: array.prototype.find"
DESCRIPTION = "Array.prototype.find ES6 polyfill."
HOMEPAGE = "https://github.com/paulmillr/Array.prototype.find#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b73ae65ff9513a76f206f931ac1685d3"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native"

SRC_URI = "https://registry.npmjs.org/array.prototype.find/-/array.prototype.find-2.1.2.tgz"
SRC_URI[md5sum] = "bd2ad5f97c8a124851aa316833fb8dd7"
SRC_URI[sha256sum] = "f35b78cc51239d0c6edcc59872e03487a401d2ea995065a0526386e38a80baea"

NPM_PKGNAME = "array.prototype.find"

inherit npmhelper
inherit native
