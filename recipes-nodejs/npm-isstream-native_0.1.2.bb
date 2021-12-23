SUMMARY = "NPM: isstream"
DESCRIPTION = "Determine if an object is a Stream"
HOMEPAGE = "https://github.com/rvagg/isstream"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=1798150b9d70250c42b55b3530e6af2b"

SRC_URI = "https://registry.npmjs.org/isstream/-/isstream-0.1.2.tgz"
SRC_URI[md5sum] = "c75038b8cfb456c19d0bb215fb5a631a"
SRC_URI[sha256sum] = "79ae4378a2a3446fb72177b57138c1382565ad75e50baba2909731ebb5c90b44"

S = "${WORKDIR}/package"

NPM_PKGNAME = "isstream"

inherit npmhelper
inherit native
