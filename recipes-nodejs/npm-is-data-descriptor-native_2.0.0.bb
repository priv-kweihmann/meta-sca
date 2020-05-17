SUMMARY = "NPM: is-data-descriptor"
DESCRIPTION = "Returns true if a value has the characteristics of a valid JavaScript data descriptor."
HOMEPAGE = "https://github.com/jonschlinkert/is-data-descriptor"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b561e0a423bedc9d9ca9c8c67d40abb9"

DEPENDS = "npm-kind-of-native"

SRC_URI = "https://registry.npmjs.org/is-data-descriptor/-/is-data-descriptor-2.0.0.tgz"
SRC_URI[md5sum] = "d8676fcc5db814dcc313755714e26c4e"
SRC_URI[sha256sum] = "336774a1e88ce08c7232706947d5f5a7669672d3615ca6182af4c21d4203957a"

NPM_PKGNAME = "is-data-descriptor"

inherit npmhelper
inherit native
