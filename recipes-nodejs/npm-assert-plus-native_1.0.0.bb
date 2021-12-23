SUMMARY = "NPM: assert-plus"
DESCRIPTION = "Extra assertions on top of node's assert module"
HOMEPAGE = "https://github.com/mcavage/node-assert-plus#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=139;endline=159;md5=0eab02dc12b94c2944df2892e803a288"

SRC_URI = "https://registry.npmjs.org/assert-plus/-/assert-plus-1.0.0.tgz"
SRC_URI[md5sum] = "8284f902f2d7c5933840e9062de2241e"
SRC_URI[sha256sum] = "47ab5c4571504bdee569f03e3423af5b51aa17d6a94866ddcae353ed2d9033eb"

S = "${WORKDIR}/package"

NPM_PKGNAME = "assert-plus"

inherit npmhelper
inherit native
