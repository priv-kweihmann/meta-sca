SUMMARY = "NPM: graceful-fs"
DESCRIPTION = "A drop-in replacement for fs, making various improvements."
HOMEPAGE = "https://github.com/isaacs/node-graceful-fs#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4"

SRC_URI = "https://registry.npmjs.org/graceful-fs/-/graceful-fs-4.2.4.tgz"
SRC_URI[md5sum] = "2fe1778d2e0aa6b3840f06826b62494a"
SRC_URI[sha256sum] = "28ad572c6c82992091469f9ddcc00454abec762a7f40fee3df30571fe5461751"

S = "${WORKDIR}/package"

NPM_PKGNAME = "graceful-fs"

inherit npmhelper
inherit native
