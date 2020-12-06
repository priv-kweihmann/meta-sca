SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.9.7.tgz"
SRC_URI[md5sum] = "d75d65fac497947a1d9af9073235d253"
SRC_URI[sha256sum] = "2800e005d58cf19494d7a0c6a8ba49bda143a4d5b9f83833498228f05a42039b"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
