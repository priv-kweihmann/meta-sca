SUMMARY = "NPM: uuid"
DESCRIPTION = "RFC4122 (v1, v4, and v5) UUIDs"
HOMEPAGE = "https://github.com/uuidjs/uuid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=353e680cdafd96bf30131cbb7b14a6e8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/uuid/-/uuid-8.3.0.tgz"
SRC_URI[md5sum] = "bfc11ece50000fcbe9c565254ac25ab5"
SRC_URI[sha256sum] = "ece69810a157ac2d61d95480b8d6cf2ee6b3d86f53c03ee5c2a15c438bc23deb"

NPM_PKGNAME = "uuid"

inherit npmhelper
inherit native
