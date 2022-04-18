SUMMARY = "NPM: array.prototype.find"
DESCRIPTION = "Array.prototype.find ES6 polyfill."
HOMEPAGE = "https://github.com/paulmillr/Array.prototype.find#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b73ae65ff9513a76f206f931ac1685d3"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native \
           npm-es-shim-unscopables-native"

SRC_URI = "https://registry.npmjs.org/array.prototype.find/-/array.prototype.find-2.2.0.tgz"
SRC_URI[md5sum] = "ec713f547ad22ceb5cf77b1282059b4c"
SRC_URI[sha256sum] = "132f73797a28c9f91511f20662cc43ee6a51473b191b4d7aa5987861c540513d"

NPM_PKGNAME = "array.prototype.find"

inherit npmhelper
inherit native
