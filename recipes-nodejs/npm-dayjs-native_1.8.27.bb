SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.8.27.tgz"
SRC_URI[md5sum] = "313eed008b7346ac9f3041beb211a0eb"
SRC_URI[sha256sum] = "32ff94ca0158ac752871b3c25015a0ae06c0b4f136a9c0c0e3dcf353a167418f"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
