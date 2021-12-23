SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.10.7.tgz"
SRC_URI[md5sum] = "135e7a783a1e9a8dc0bee297ed49db62"
SRC_URI[sha256sum] = "b65d9843efafa83b0f63d9dc4dcf53cdfe2bec5bfb331bf625ffde015214f6c3"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
