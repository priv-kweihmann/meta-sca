SUMMARY = "NPM: dayjs"
DESCRIPTION = "2KB immutable date time library alternative to Moment.js with the same modern API "
HOMEPAGE = "https://day.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=928913777077eb4559660390651e482e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/dayjs/-/dayjs-1.9.6.tgz"
SRC_URI[md5sum] = "6443bd72019c8b11d61da1cca45b1c52"
SRC_URI[sha256sum] = "6ba50adad6bdc6d3d8b23c6b354004a15716b8f1f3c2f25d18d9a0e82be2a91d"

NPM_PKGNAME = "dayjs"

inherit npmhelper
inherit native
