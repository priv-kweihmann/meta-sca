SUMMARY = "NPM: graceful-fs"
DESCRIPTION = "A drop-in replacement for fs, making various improvements."
HOMEPAGE = "https://github.com/isaacs/node-graceful-fs#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/graceful-fs/-/graceful-fs-4.2.6.tgz"
SRC_URI[md5sum] = "daa4c01f4d01fa7976a43c17cf2f9454"
SRC_URI[sha256sum] = "25334251eddf26a85b59b6c7c994b954cbae4831640881fba46bef3f26cbe537"

NPM_PKGNAME = "graceful-fs"

inherit npmhelper
inherit native
