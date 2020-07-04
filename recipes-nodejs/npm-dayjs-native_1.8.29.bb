SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.8.29.tgz"
SRC_URI[md5sum] = "2abc9b8cf5376d10db654de082b8291b"
SRC_URI[sha256sum] = "68633bc361971ebec9b70dc2ad2a0b421401ceb2308ce40fc7b8be907ae33ec6"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
