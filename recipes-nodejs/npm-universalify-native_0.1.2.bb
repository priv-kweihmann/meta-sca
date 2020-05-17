SUMMARY = "NPM: universalify"
DESCRIPTION = "Make a callback- or promise-based function support both promises and callbacks."
HOMEPAGE = "https://github.com/RyanZim/universalify#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a734c6ad6e37a515025ac5e8e90ef786"

SRC_URI = "https://registry.npmjs.org/universalify/-/universalify-0.1.2.tgz"
SRC_URI[md5sum] = "7aff073e1c11aa9cead5e029bb3b291c"
SRC_URI[sha256sum] = "8c2ab1faef3d3e88b210515b37e56bcdd39e0d02363f8b357872ca5de75dd353"

S = "${WORKDIR}/package"

NPM_PKGNAME = "universalify"

inherit npmhelper
inherit native
