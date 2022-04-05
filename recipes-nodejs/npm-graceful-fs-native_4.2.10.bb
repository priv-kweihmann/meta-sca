SUMMARY = "NPM: graceful-fs"
DESCRIPTION = "A drop-in replacement for fs, making various improvements."
HOMEPAGE = "https://github.com/isaacs/node-graceful-fs#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=163972d49c2f7a3d3b687aeb48e9e3c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/graceful-fs/-/graceful-fs-4.2.10.tgz"
SRC_URI[md5sum] = "094ac6976c4cec6cced67915d6c726c0"
SRC_URI[sha256sum] = "b9d05da264d6668f952e6a17b2bf8f3955e977366dabf7c3cdfab3850dd14c6d"

NPM_PKGNAME = "graceful-fs"

inherit npmhelper
inherit native
