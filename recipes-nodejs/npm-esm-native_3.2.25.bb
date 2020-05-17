SUMMARY = "NPM: esm"
DESCRIPTION = "Tomorrow's ECMAScript modules today!"
HOMEPAGE = "https://github.com/standard-things/esm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=26c715ef7f42ee0c4a920838afee6252"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/esm/-/esm-3.2.25.tgz"
SRC_URI[md5sum] = "c9f53fe7f4deec7da0819bdcb616024d"
SRC_URI[sha256sum] = "eb4dd4462e283b2623e6e95c5f7478b7b8c73055a2feee49f2ddd08c99c8458a"

NPM_PKGNAME = "esm"

inherit npmhelper
inherit native
