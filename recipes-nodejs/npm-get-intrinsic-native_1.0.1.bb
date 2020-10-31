SUMMARY = "NPM: get-intrinsic"
DESCRIPTION = "Get and robustly cache all JS language-level intrinsics at first require time"
HOMEPAGE = "https://github.com/ljharb/get-intrinsic#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0eb2c73daa0ecf037cbdf3d0bb0c98d5"

DEPENDS = "npm-function-bind-native \
           npm-has-native \
           npm-has-symbols-native"

SRC_URI = "https://registry.npmjs.org/get-intrinsic/-/get-intrinsic-1.0.1.tgz"
SRC_URI[md5sum] = "d1ba8c28ed389ffb5bfbe9af6b0dd31d"
SRC_URI[sha256sum] = "90a65b8ecec8e16a23f87af8a2033af97c09f5a9164ebd53184e3aff53e4fd5d"

NPM_PKGNAME = "get-intrinsic"

inherit npmhelper
inherit native
