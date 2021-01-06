SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.10.2.tgz"
SRC_URI[md5sum] = "368eb8054c8b20e85817a34b3bfa7f75"
SRC_URI[sha256sum] = "251c7a510619c85afe9151ebe2bc7e71b8a5202299b6c8b676742015381d71f2"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
