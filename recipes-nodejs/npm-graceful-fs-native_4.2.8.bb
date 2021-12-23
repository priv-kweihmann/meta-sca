SUMMARY = "NPM: graceful-fs"
DESCRIPTION = "A drop-in replacement for fs, making various improvements."
HOMEPAGE = "https://github.com/isaacs/node-graceful-fs#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/graceful-fs/-/graceful-fs-4.2.8.tgz"
SRC_URI[md5sum] = "4dfb16244f19c3d1f75e118d0f9e0cd4"
SRC_URI[sha256sum] = "e56a11aa13f860beabdf64560c026e9272605e3288e12689134fb835dfb56da6"

NPM_PKGNAME = "graceful-fs"

inherit npmhelper
inherit native
