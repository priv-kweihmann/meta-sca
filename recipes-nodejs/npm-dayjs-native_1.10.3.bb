SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.10.3.tgz"
SRC_URI[md5sum] = "ea9de1841a1807e35e77f447e39f7bde"
SRC_URI[sha256sum] = "4bbcf67bafb79931ef6073df83fb5cbb5307bd7a114a6c744bd9646f2c4ea0dc"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
