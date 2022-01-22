SUMMARY = "NPM: node-domexception"
DESCRIPTION = "An implementation of the DOMException class from NodeJS"
HOMEPAGE = "https://github.com/jimmywarting/node-domexception#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ec18f6be7ab0531adbbc1b41a288d8ea"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-domexception/-/node-domexception-1.0.0.tgz"
SRC_URI[md5sum] = "e7071af9f711995249907ce3b8ad6db0"
SRC_URI[sha256sum] = "eba234134890897807b85c2bc67cd32d0242eb9be1d1c62513797fdaab60c971"

NPM_PKGNAME = "node-domexception"

inherit npmhelper
inherit native
