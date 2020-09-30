SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.9.1.tgz"
SRC_URI[md5sum] = "6675bee37ea563b470b6498a29a9f0ba"
SRC_URI[sha256sum] = "c1a8f5dc3c8aa1b2818b99deaf307556fd0bba6ea71a09754a8866ba59ebd8c1"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
