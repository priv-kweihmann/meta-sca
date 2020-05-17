SUMMARY = "NPM: merge2"
DESCRIPTION = "Merge multiple streams into one stream in sequence or parallel."
HOMEPAGE = "https://github.com/teambition/merge2"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9fb3d3f31f365295d239fa064121670a"

SRC_URI = "https://registry.npmjs.org/merge2/-/merge2-1.3.0.tgz"
SRC_URI[md5sum] = "f28c5ccf4bc6db2e25a329f71cad17f1"
SRC_URI[sha256sum] = "81f83cca23f97379e8eb0b1c8e08d62e8e6fadd1914ce2d7a2f30ae4f307922e"

NPM_PKGNAME = "merge2"

inherit npmhelper
inherit native
