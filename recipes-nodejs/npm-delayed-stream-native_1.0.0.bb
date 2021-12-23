SUMMARY = "NPM: delayed-stream"
DESCRIPTION = "Buffers events from a stream until you are ready to handle them."
HOMEPAGE = "https://github.com/felixge/node-delayed-stream"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License;md5=5270b4ddb6700d0a820e6d066744589c"

SRC_URI = "https://registry.npmjs.org/delayed-stream/-/delayed-stream-1.0.0.tgz"
SRC_URI[md5sum] = "d952bd4539d68c2c779a23dd75c1c6b1"
SRC_URI[sha256sum] = "ac38fce4217dfb1d772427c7d8d0d073e35ecd832915e97a61d9ab5c504129d3"

S = "${WORKDIR}/package"

NPM_PKGNAME = "delayed-stream"

inherit npmhelper
inherit native
