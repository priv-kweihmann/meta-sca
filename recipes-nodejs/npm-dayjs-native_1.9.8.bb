SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.9.8.tgz"
SRC_URI[md5sum] = "cc10ee5547ca6f87752e1878748c94a6"
SRC_URI[sha256sum] = "7a178c5b720f0eafb56feb3ccfb0603bd7a9f93edae77cf2e87d5afe096f4e87"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
