SUMMARY = "NPM: assign-symbols"
DESCRIPTION = "Assign the enumerable es6 Symbol properties from an object (or objects) to the first object passed on the arguments. Can be used as a supplement to other extend, assign or merge methods as a polyfill for the Symbols part of the es6 Object.assign method."
HOMEPAGE = "https://github.com/jonschlinkert/assign-symbols"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e060235353cb686ae1695ec7db63cfbc"

SRC_URI = "https://registry.npmjs.org/assign-symbols/-/assign-symbols-1.0.0.tgz"
SRC_URI[md5sum] = "e9bb66200b728da39a79c2f235780331"
SRC_URI[sha256sum] = "4b7571316a051e6b9c816119fecabc1c23f2d3d72ece4150a28436f89f59ecd2"

NPM_PKGNAME = "assign-symbols"

inherit npmhelper
inherit native
