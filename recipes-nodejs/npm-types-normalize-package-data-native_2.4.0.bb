SUMMARY = "NPM: @types/normalize-package-data"
DESCRIPTION = "TypeScript definitions for normalize-package-data"


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b98fddd052bb2f5ddbcdbd417ffb26a8"

SRC_URI = "https://registry.npmjs.org/@types/normalize-package-data/-/normalize-package-data-2.4.0.tgz"
SRC_URI[md5sum] = "d6407969cddce9e389d14b2ab5a6e5bf"
SRC_URI[sha256sum] = "90a8066b88f7cf71e43fe79143bce45d8fd9245a9f11f3ca49ac494019a46a59"

NPM_PKGNAME = "@types/normalize-package-data"

inherit npmhelper
inherit native

S = "${WORKDIR}/normalize-package-data"
