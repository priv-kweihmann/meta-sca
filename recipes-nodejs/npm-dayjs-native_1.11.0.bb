SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.11.0.tgz"
SRC_URI[md5sum] = "94efebfc63b7b7979f40f89b36196fe3"
SRC_URI[sha256sum] = "02b8facbaabecaa25da7b216da78aaf120e146fb5e93e70ca08814ea08344730"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
