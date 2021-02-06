SUMMARY = "NPM: graceful-fs"
DESCRIPTION = "A drop-in replacement for fs, making various improvements."
HOMEPAGE = "https://github.com/isaacs/node-graceful-fs#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/graceful-fs/-/graceful-fs-4.2.5.tgz"
SRC_URI[md5sum] = "5b701babc1f1835b112bc0138663e990"
SRC_URI[sha256sum] = "bd58382e51bdaefac4ba431440ab0f2094a76a12e13f35145d17e004db3af1ce"

NPM_PKGNAME = "graceful-fs"

inherit npmhelper
inherit native
