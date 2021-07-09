SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.10.6.tgz"
SRC_URI[md5sum] = "9e9cf434c83ab8096e9987ec28ec9f47"
SRC_URI[sha256sum] = "924bbad137ca0358de3fbe6c61f1be4f6ec3e1320fb748194327f7a961b47d2f"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
