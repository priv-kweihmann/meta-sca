SUMMARY = "NPM: uuid"
DESCRIPTION = "RFC4122 (v1, v4, and v5) UUIDs"
HOMEPAGE = "https://github.com/uuidjs/uuid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=353e680cdafd96bf30131cbb7b14a6e8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/uuid/-/uuid-8.3.1.tgz"
SRC_URI[md5sum] = "4da6a6a33a7971e6ddb89421d1d6c11d"
SRC_URI[sha256sum] = "dc10c359df712093b4f74dd4779e684f3f03258b5ac507d49024cf06149b922a"

NPM_PKGNAME = "uuid"

inherit npmhelper
inherit native
