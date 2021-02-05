SUMMARY = "NPM: get-intrinsic"
DESCRIPTION = "Get and robustly cache all JS language-level intrinsics at first require time"
HOMEPAGE = "https://github.com/ljharb/get-intrinsic#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0eb2c73daa0ecf037cbdf3d0bb0c98d5"

DEPENDS = "npm-function-bind-native \
           npm-has-native \
           npm-has-symbols-native"

SRC_URI = "https://registry.npmjs.org/get-intrinsic/-/get-intrinsic-1.1.1.tgz"
SRC_URI[md5sum] = "dcf91ab5448081811d382dfabad32bb6"
SRC_URI[sha256sum] = "5a1b968faf5a6c2c3833e40321641651cbee32e41296e573d84b88ed2fe07b1b"

NPM_PKGNAME = "get-intrinsic"

inherit npmhelper
inherit native
