SUMMARY = "NPM: defer-to-connect"
DESCRIPTION = "The safe way to handle the `connect` socket event"
HOMEPAGE = "https://github.com/szmarczak/defer-to-connect#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/defer-to-connect/-/defer-to-connect-1.1.3.tgz"
SRC_URI[md5sum] = "7a2c941c4cbdb57920651ba2e6029044"
SRC_URI[sha256sum] = "31c0c81461b3bac87f1947d69f66133f40ede25acbfb0de0bcece61cab71bf56"

NPM_PKGNAME = "defer-to-connect"

inherit npmhelper
inherit native
