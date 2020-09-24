SUMMARY = "NPM: mime-db"
DESCRIPTION = "Media Type Database"
HOMEPAGE = "https://github.com/jshttp/mime-db#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mime-db/-/mime-db-1.45.0.tgz"
SRC_URI[md5sum] = "2e1c732da1cde37b6c4a4280fdc9e046"
SRC_URI[sha256sum] = "43d8f62cd721fc986b4a2a75ec8955d8535f4a201faf6803dc92a14f100e6a2f"

NPM_PKGNAME = "mime-db"

inherit npmhelper
inherit native
