SUMMARY = "NPM: is-data-descriptor"
DESCRIPTION = "Returns true if a value has the characteristics of a valid JavaScript data descriptor."
HOMEPAGE = "https://github.com/jonschlinkert/is-data-descriptor"

DEPENDS = "npm-kind-of-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1027d1336ffdd3b96ff1cfd1d3bea3fc"

SRC_URI = "https://registry.npmjs.org/is-data-descriptor/-/is-data-descriptor-1.0.0.tgz"
SRC_URI[md5sum] = "d4fe7614279e3f4718d383035209c33e"
SRC_URI[sha256sum] = "28c25461e29798d16795eadabe11cc5ced4904f9ca1761bc0463e403759ca12c"

NPM_PKGNAME = "is-data-descriptor"

inherit npmhelper
inherit native
