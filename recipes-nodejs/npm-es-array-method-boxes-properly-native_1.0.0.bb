SUMMARY = "NPM: es-array-method-boxes-properly"
DESCRIPTION = "Utility package to determine if an `Array.prototype` method properly boxes the callback's receiver and third argument."
HOMEPAGE = "https://github.com/ljharb/es-array-method-boxes-properly#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=375dc7ca936a14e9c29418d5263bd066"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/es-array-method-boxes-properly/-/es-array-method-boxes-properly-1.0.0.tgz"
SRC_URI[md5sum] = "5102e06abaa5bc9449920a3d3fed5615"
SRC_URI[sha256sum] = "11ac9478be1e1d1279ec52484bcb0c21569cb5818a9a3a58e8fc40daa3af01b9"

NPM_PKGNAME = "es-array-method-boxes-properly"

inherit npmhelper
inherit native
