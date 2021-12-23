SUMMARY = "NPM: micromark-util-types"
DESCRIPTION = "micromark utility with a couple of typescript types"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=63;endline=64;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/micromark-util-types/-/micromark-util-types-1.0.2.tgz"
SRC_URI[md5sum] = "f54412d481a46db7f0ec4b83ca819a3a"
SRC_URI[sha256sum] = "14fb8df62b1ec7f39f3c57c7a5675b3d3a933f2b88f4db464d79467794e3d730"

NPM_PKGNAME = "micromark-util-types"

inherit npmhelper
inherit native
