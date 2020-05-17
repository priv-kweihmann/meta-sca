SUMMARY = "NPM: date-now"
DESCRIPTION = "A requirable version of Date.now()"
HOMEPAGE = "https://github.com/Colingo/date-now"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=d91e9f173d4b3af83019acabd84f997e"

SRC_URI = "https://registry.npmjs.org/date-now/-/date-now-0.1.4.tgz"
SRC_URI[md5sum] = "a3ed99977f12d4b48f8bef461e3b0af7"
SRC_URI[sha256sum] = "58997a22bf6f63e0b6b07103d41c3ae6768dc5007c6717c4ff30ff715b15e2c3"

S = "${WORKDIR}/package"

NPM_PKGNAME = "date-now"

inherit npmhelper
inherit native
