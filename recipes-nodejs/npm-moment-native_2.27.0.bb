SUMMARY = "NPM: moment"
DESCRIPTION = "Parse, validate, manipulate, and display dates"
HOMEPAGE = "https://momentjs.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=397bb5fedab22612d8d69f1458a9321e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/moment/-/moment-2.27.0.tgz"
SRC_URI[md5sum] = "3860ef005b342bc0ee9a816e5a4e8943"
SRC_URI[sha256sum] = "df72ec9445f517cdd8556149cfc873d9954f3df201ee71e404859a2df77a10db"

NPM_PKGNAME = "moment"

inherit npmhelper
inherit native
