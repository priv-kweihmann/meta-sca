SUMMARY = "NPM: es-shim-unscopables"
DESCRIPTION = "Helper package to shim a method into `Array.prototype[Symbol.unscopables]`"
HOMEPAGE = "https://github.com/ljharb/es-shim-unscopables#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8478c87d16770f6d32a4578c475d3930"

DEPENDS = "npm-has-native"

SRC_URI = "https://registry.npmjs.org/es-shim-unscopables/-/es-shim-unscopables-1.0.0.tgz"
SRC_URI[md5sum] = "b84453b40e877a87ea66b886373597f4"
SRC_URI[sha256sum] = "a8accca616c58a9c8ce92bc27d9d287d3948cf8310af5fa05d69c1a14d156761"

NPM_PKGNAME = "es-shim-unscopables"

inherit npmhelper
inherit native
