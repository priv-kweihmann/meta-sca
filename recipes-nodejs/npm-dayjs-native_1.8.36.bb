SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.8.36.tgz"
SRC_URI[md5sum] = "1d91144a53ebb530ade92b0f15dd93a1"
SRC_URI[sha256sum] = "dcb9cfb9baa53a40701cba82b3dfa82f9ae5230fcf1194943da9326bceccb4de"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
