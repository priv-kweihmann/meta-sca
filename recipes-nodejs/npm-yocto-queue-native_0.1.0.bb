SUMMARY = "NPM: yocto-queue"
DESCRIPTION = "Tiny queue data structure"
HOMEPAGE = "https://github.com/sindresorhus/yocto-queue#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yocto-queue/-/yocto-queue-0.1.0.tgz"
SRC_URI[md5sum] = "69e27040e38c5b03127488546dc282ea"
SRC_URI[sha256sum] = "c772bceca58f20f0ea08ac6121ba385f55db715cd3c2c46b2b38d06d3c6129f1"

NPM_PKGNAME = "yocto-queue"

inherit npmhelper
inherit native
