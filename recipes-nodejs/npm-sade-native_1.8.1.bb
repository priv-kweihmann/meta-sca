SUMMARY = "NPM: sade"
DESCRIPTION = "Smooth (CLI) operator 🎶"
HOMEPAGE = "https://github.com/lukeed/sade#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a1892d5a0eed5aae41e3df6a732d5ca3"

DEPENDS = "npm-mri-native"

SRC_URI = "https://registry.npmjs.org/sade/-/sade-1.8.1.tgz"
SRC_URI[md5sum] = "67ab0b2793a3205cfb6ee41692a7c439"
SRC_URI[sha256sum] = "73dfd051a36ea90daf95c811ba503bb5230b24f86afbe755c254736dad5d045e"

NPM_PKGNAME = "sade"

inherit npmhelper
inherit native
