SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.8.28.tgz"
SRC_URI[md5sum] = "6066239e5c4717903a01799d95266bad"
SRC_URI[sha256sum] = "8f002efc0aba1a26e163a7ec687219151d8ddcede17331ab516c6255c098560f"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
