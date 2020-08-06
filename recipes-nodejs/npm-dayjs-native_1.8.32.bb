SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.8.32.tgz"
SRC_URI[md5sum] = "5c045488899713833f9689534e0d01df"
SRC_URI[sha256sum] = "8fa2f7a8af1f59954472de203fcd66497a623af54b1d25b8bf08c2d937760102"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
