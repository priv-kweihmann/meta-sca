SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.8.33.tgz"
SRC_URI[md5sum] = "12403ee823765d3910a8e4cd7bfad54a"
SRC_URI[sha256sum] = "633cd8d2269ae858229dc6b4d81d55cf1b2322eb87a20c34084b6182c14985cd"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
