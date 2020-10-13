SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.9.2.tgz"
SRC_URI[md5sum] = "c10b7b6f2b6bd5c14d82b4e1b77c021e"
SRC_URI[sha256sum] = "cd745c7ed4acf4d387c2354fb8b3bdf1f8d282ab5656d7960e9b6b9ad3c61076"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
