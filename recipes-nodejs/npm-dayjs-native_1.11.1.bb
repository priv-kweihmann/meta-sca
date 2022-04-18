SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.11.1.tgz"
SRC_URI[md5sum] = "dea37bc6ef388f6092d4914923b706ab"
SRC_URI[sha256sum] = "7375591aff4ab4b7d8548daa20cedecd604ac6a965e8216c9e315fa81424402c"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
