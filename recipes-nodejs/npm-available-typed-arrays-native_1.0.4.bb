SUMMARY = "NPM: available-typed-arrays"
DESCRIPTION = "Returns an array of Typed Array names that are available in the current environment"
HOMEPAGE = "https://github.com/inspect-js/available-typed-arrays#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838b75dc6028daf3e04e57871b7ad3ed"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/available-typed-arrays/-/available-typed-arrays-1.0.4.tgz"
SRC_URI[md5sum] = "e9005553a77bcf3b45fc612b04157e8a"
SRC_URI[sha256sum] = "08fd4fe682c9d0bbcc7aa3d073cc987d95f42e9ee56ca7246ab33712de02ded5"

NPM_PKGNAME = "available-typed-arrays"

inherit npmhelper
inherit native
