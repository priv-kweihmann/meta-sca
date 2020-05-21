SUMMARY = "NPM: uuid"
DESCRIPTION = "RFC4122 (v1, v4, and v5) UUIDs"
HOMEPAGE = "https://github.com/uuidjs/uuid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=a7cc7773019edb9e1620a3b7f8fa66d1"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/uuid/-/uuid-8.1.0.tgz"
SRC_URI[md5sum] = "0463dd2e0d8c8319c73cb745b1df2687"
SRC_URI[sha256sum] = "0de82b8817aeb5e08f7330ca3b22ad4a88117c483f31c5868a17056c54997444"

NPM_PKGNAME = "uuid"

inherit npmhelper
inherit native
