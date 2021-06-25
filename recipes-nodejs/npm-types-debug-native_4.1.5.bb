SUMMARY = "NPM: @types/debug"
DESCRIPTION = "TypeScript definitions for debug"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27e94c0280987ab296b0b8dd02ab9fe5"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/debug/-/debug-4.1.5.tgz"
SRC_URI[md5sum] = "f18778a0c37f2d1d956d20af4b0d62f8"
SRC_URI[sha256sum] = "0e297ffcbe469f1c1607545011deda79e1db4d394a6e77c33ea939d4e3d78d87"

NPM_PKGNAME = "@types/debug"

inherit npmhelper
inherit native

S = "${WORKDIR}/debug"
