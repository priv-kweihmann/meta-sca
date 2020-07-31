SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.8.31.tgz"
SRC_URI[md5sum] = "c6963415372e448f418f123256b96dc9"
SRC_URI[sha256sum] = "c06c90415f8d52dad37046e11befe219698ba5c1dd3470aad68e3cbbd2aa6341"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
