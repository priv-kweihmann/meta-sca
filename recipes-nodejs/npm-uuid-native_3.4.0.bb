SUMMARY = "NPM: uuid"
DESCRIPTION = "RFC4122 (v1, v4, and v5) UUIDs"
HOMEPAGE = "https://github.com/uuidjs/uuid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c9420736e23afb538ba5fbe44197f0b4"

SRC_URI = "https://registry.npmjs.org/uuid/-/uuid-3.4.0.tgz"
SRC_URI[md5sum] = "2fa27207bb65f4e05c6f10bc0448f662"
SRC_URI[sha256sum] = "ba77c9306dbc34c7ae503e9eb142e284f98ea9ab609f416052c2fbbefb6df4dd"

S = "${WORKDIR}/package"

NPM_PKGNAME = "uuid"

inherit npmhelper
inherit native
