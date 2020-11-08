SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.9.5.tgz"
SRC_URI[md5sum] = "7ca0d1cbe1ef85a3228b6025a0d3dcfc"
SRC_URI[sha256sum] = "e19598a259f8305ff163bf123c7a32f0d3bfe26813f0eba5268a88a1c9c3a83d"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
