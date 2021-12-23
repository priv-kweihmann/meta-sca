SUMMARY = "NPM: uuid"
DESCRIPTION = "RFC4122 (v1, v4, and v5) UUIDs"
HOMEPAGE = "https://github.com/uuidjs/uuid#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=353e680cdafd96bf30131cbb7b14a6e8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/uuid/-/uuid-8.3.2.tgz"
SRC_URI[md5sum] = "001956ff1c0a16e6bae8bae042ba226b"
SRC_URI[sha256sum] = "f630703647a5821c735a542edcf8d26c989724efe9d9912ab6f6836a1e79924a"

NPM_PKGNAME = "uuid"

inherit npmhelper
inherit native
