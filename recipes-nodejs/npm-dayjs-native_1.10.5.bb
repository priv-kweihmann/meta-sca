SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.10.5.tgz"
SRC_URI[md5sum] = "76efbc23b3385f0ba4c66275509db3f0"
SRC_URI[sha256sum] = "ed327422b8d8d1264596c2549dd67f1e6d67ea656e3ba0720fc369bed5db6d4e"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
