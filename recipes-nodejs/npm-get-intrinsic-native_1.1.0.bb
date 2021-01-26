SUMMARY = "NPM: get-intrinsic"
DESCRIPTION = "Get and robustly cache all JS language-level intrinsics at first require time"
HOMEPAGE = "https://github.com/ljharb/get-intrinsic#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0eb2c73daa0ecf037cbdf3d0bb0c98d5"

DEPENDS = "npm-function-bind-native \
           npm-has-native \
           npm-has-symbols-native"

SRC_URI = "https://registry.npmjs.org/get-intrinsic/-/get-intrinsic-1.1.0.tgz"
SRC_URI[md5sum] = "89dcd1818ca78974f921c894cddca066"
SRC_URI[sha256sum] = "f30288510d7771b4be09f380cae8bdc9660cf3d21a1d3a8b9af343f4e98a6030"

NPM_PKGNAME = "get-intrinsic"

inherit npmhelper
inherit native
