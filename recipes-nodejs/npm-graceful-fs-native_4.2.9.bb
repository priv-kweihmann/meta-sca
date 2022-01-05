SUMMARY = "NPM: graceful-fs"
DESCRIPTION = "A drop-in replacement for fs, making various improvements."
HOMEPAGE = "https://github.com/isaacs/node-graceful-fs#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/graceful-fs/-/graceful-fs-4.2.9.tgz"
SRC_URI[md5sum] = "e387a6dfac11fd5d79bd2718100e08b6"
SRC_URI[sha256sum] = "16677911bf936576c5c73447657a30b4c535ddf8dc2fa0c8109ae93fa9319f0a"

NPM_PKGNAME = "graceful-fs"

inherit npmhelper
inherit native
