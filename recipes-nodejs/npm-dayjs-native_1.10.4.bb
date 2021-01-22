SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.10.4.tgz"
SRC_URI[md5sum] = "4ab1774d8b59f2dba0344df2bcf640bd"
SRC_URI[sha256sum] = "7fd1f40aeb20f802c5cb26e1465477f27e72d602f50791d3411cf8c33f780b6f"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
