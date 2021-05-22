SUMMARY = "NPM: available-typed-arrays"
DESCRIPTION = "Returns an array of Typed Array names that are available in the current environment"
HOMEPAGE = "https://github.com/inspect-js/available-typed-arrays#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838b75dc6028daf3e04e57871b7ad3ed"

DEPENDS = "npm-array.prototype.filter-native"

SRC_URI = "https://registry.npmjs.org/available-typed-arrays/-/available-typed-arrays-1.0.3.tgz"
SRC_URI[md5sum] = "75f9858bfd52ab0c2d04ce1f1f986021"
SRC_URI[sha256sum] = "174c4b47b96be4fb5ec55e1b94f64b241ac435b3c2ee452c95bfbc7506f6c4e5"

NPM_PKGNAME = "available-typed-arrays"

inherit npmhelper
inherit native
