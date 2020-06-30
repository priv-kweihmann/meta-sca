SUMMARY = "NPM: uuid"
DESCRIPTION = "RFC4122 (v1, v4, and v5) UUIDs"
HOMEPAGE = "https://github.com/uuidjs/uuid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=353e680cdafd96bf30131cbb7b14a6e8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/uuid/-/uuid-8.2.0.tgz"
SRC_URI[md5sum] = "beea7fd8baac6c93d135832539cfe10a"
SRC_URI[sha256sum] = "01f5dcbd1ad29801cad2123a9640f074f8cd1e961be4e1bc0746f7a25bc6b324"

NPM_PKGNAME = "uuid"

inherit npmhelper
inherit native
