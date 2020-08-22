SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.8.34.tgz"
SRC_URI[md5sum] = "da566ba06779e1f8341624d7701801a1"
SRC_URI[sha256sum] = "465f6fea1330ae626a735d642572649b35f734bac76902abdce93423fd31d21e"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
