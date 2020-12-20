SUMMARY = "NPM: get-intrinsic"
DESCRIPTION = "Get and robustly cache all JS language-level intrinsics at first require time"
HOMEPAGE = "https://github.com/ljharb/get-intrinsic#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0eb2c73daa0ecf037cbdf3d0bb0c98d5"

DEPENDS = "npm-function-bind-native \
           npm-has-native \
           npm-has-symbols-native"

SRC_URI = "https://registry.npmjs.org/get-intrinsic/-/get-intrinsic-1.0.2.tgz"
SRC_URI[md5sum] = "4aad83647cbbd2ac00525f19435d7ce4"
SRC_URI[sha256sum] = "7f662876a4292726529df8acd9fc95d062df7031e73b7d1f302b95e0395504f0"

NPM_PKGNAME = "get-intrinsic"

inherit npmhelper
inherit native
