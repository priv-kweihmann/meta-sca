SUMMARY = "NPM: combined-stream"
DESCRIPTION = "A stream that emits multiple other streams one after another."
HOMEPAGE = "https://github.com/felixge/node-combined-stream"

DEPENDS = "npm-delayed-stream-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License;md5=5270b4ddb6700d0a820e6d066744589c"

SRC_URI = "https://registry.npmjs.org/combined-stream/-/combined-stream-1.0.8.tgz"
SRC_URI[md5sum] = "08f30e7b4b1e471621c039e96acad86d"
SRC_URI[sha256sum] = "b6be5aabe53e90635beb77cd0e0ba7ae6a25c8cf903b15fcc342353e732e1512"

S = "${WORKDIR}/package"

NPM_PKGNAME = "combined-stream"

inherit npmhelper
inherit native
