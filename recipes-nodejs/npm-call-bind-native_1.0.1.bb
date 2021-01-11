SUMMARY = "NPM: call-bind"
DESCRIPTION = "Robustly `.call.bind()` a function"
HOMEPAGE = "https://github.com/ljharb/call-bind#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0eb2c73daa0ecf037cbdf3d0bb0c98d5"

DEPENDS = "npm-function-bind-native \
           npm-get-intrinsic-native"

SRC_URI = "https://registry.npmjs.org/call-bind/-/call-bind-1.0.1.tgz"
SRC_URI[md5sum] = "1388515dffdbc5bff2b9e512178d19a5"
SRC_URI[sha256sum] = "75e4ec5a1f369bb2fddaee514e79dfcd9a3774267daecf0f47b6cfe69570c7cc"

NPM_PKGNAME = "call-bind"

inherit npmhelper
inherit native
