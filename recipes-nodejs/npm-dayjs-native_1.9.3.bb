SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.9.3.tgz"
SRC_URI[md5sum] = "df5d763a90ee728b33a246d2310ae1a9"
SRC_URI[sha256sum] = "25a7a50619252433d8525dfa842f169b536819593c21683e69f8c7113339fa9b"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
