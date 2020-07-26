SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.8.30.tgz"
SRC_URI[md5sum] = "c616b33d07ef0f47a39c658035997955"
SRC_URI[sha256sum] = "f40e4039df9df5aed77d36d2dd964941e78a40a70068e9d61c99f4fbf2f68847"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
