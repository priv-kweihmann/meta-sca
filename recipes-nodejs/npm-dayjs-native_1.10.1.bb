SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.10.1.tgz"
SRC_URI[md5sum] = "d8ff18b1fba18a44798af1f5eb04b275"
SRC_URI[sha256sum] = "21d254407d77ddca1d1f01284c237fa9f3218e7a15f0d2c9b96b7e7ac68cd484"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
