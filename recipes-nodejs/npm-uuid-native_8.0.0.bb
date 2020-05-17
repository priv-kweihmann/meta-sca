SUMMARY = "NPM: uuid"
DESCRIPTION = "RFC4122 (v1, v4, and v5) UUIDs"
HOMEPAGE = "https://github.com/uuidjs/uuid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=a7cc7773019edb9e1620a3b7f8fa66d1"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/uuid/-/uuid-8.0.0.tgz"
SRC_URI[md5sum] = "731f260cf1ba0489d877ba1d22318981"
SRC_URI[sha256sum] = "8f4f1bbbc625eb1c7ccf8346f195ce7c610fc6b83054112ad3d927a796a55f1e"

NPM_PKGNAME = "uuid"

inherit npmhelper
inherit native
