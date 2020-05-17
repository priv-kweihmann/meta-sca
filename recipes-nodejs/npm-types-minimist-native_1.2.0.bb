SUMMARY = "NPM: @types/minimist"
DESCRIPTION = "TypeScript definitions for minimist"


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=17;md5=2eaaa7047390855eca10d717609467f2"

SRC_URI = "https://registry.npmjs.org/@types/minimist/-/minimist-1.2.0.tgz"
SRC_URI[md5sum] = "3c75dc194ad7718086a85f66607543b0"
SRC_URI[sha256sum] = "47b1e4e25b76f1fc7b435ec6a18cf9abca1dba1482ce66e68bed0f5e0602e399"

NPM_PKGNAME = "@types/minimist"

inherit npmhelper
inherit native

S = "${WORKDIR}/minimist"
