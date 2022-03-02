SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.10.8.tgz"
SRC_URI[md5sum] = "09d29a644a337671c962d902ec0484f2"
SRC_URI[sha256sum] = "66646f81c5eb2829d0f5a20271f18f96400458753bb74f3033e1e8e566ddbdc0"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
