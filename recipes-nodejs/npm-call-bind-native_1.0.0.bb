SUMMARY = "NPM: call-bind"
DESCRIPTION = "Robustly `.call.bind()` a function"
HOMEPAGE = "https://github.com/ljharb/call-bind#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0eb2c73daa0ecf037cbdf3d0bb0c98d5"

DEPENDS = "npm-function-bind-native \
           npm-get-intrinsic-native"

SRC_URI = "https://registry.npmjs.org/call-bind/-/call-bind-1.0.0.tgz"
SRC_URI[md5sum] = "442409cbb96b58873ea22059cd849ddc"
SRC_URI[sha256sum] = "016cf1bb81d5bf7bd4dd14ecb166aaba962a75428cf11b1923259bd25811f327"

NPM_PKGNAME = "call-bind"

inherit npmhelper
inherit native
