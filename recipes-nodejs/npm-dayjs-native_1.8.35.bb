SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.8.35.tgz"
SRC_URI[md5sum] = "56865311a47a02503b5aac86fd380467"
SRC_URI[sha256sum] = "7219340cbb96c4a3c5e0588944bee2aa92bc7cd4d3bc8eb72e6da1c4de1e22bc"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
