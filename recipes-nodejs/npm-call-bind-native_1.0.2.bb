SUMMARY = "NPM: call-bind"
DESCRIPTION = "Robustly `.call.bind()` a function"
HOMEPAGE = "https://github.com/ljharb/call-bind#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0eb2c73daa0ecf037cbdf3d0bb0c98d5"

DEPENDS = "npm-function-bind-native \
           npm-get-intrinsic-native"

SRC_URI = "https://registry.npmjs.org/call-bind/-/call-bind-1.0.2.tgz"
SRC_URI[md5sum] = "d244c20a7b3f2c607030df6337a4e68d"
SRC_URI[sha256sum] = "c3956f8ad486c8ed25508d016738e3fc2126f9b77c89a080263cdf05e214341a"

NPM_PKGNAME = "call-bind"

inherit npmhelper
inherit native
