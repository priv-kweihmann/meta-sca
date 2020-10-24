SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.9.4.tgz"
SRC_URI[md5sum] = "d5f885d1f76948d479419519f794c799"
SRC_URI[sha256sum] = "6d90b6fb852b8a44ba142fe8efd25e288f7434892e8a0ee2862b0f15132e3dd8"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
