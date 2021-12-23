SUMMARY = "NPM: @humanwhocodes/object-schema"
DESCRIPTION = "An object schema merger/validator"
HOMEPAGE = "https://github.com/humanwhocodes/object-schema#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3344c71e5e1f339b11038bec8a90bc4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@humanwhocodes/object-schema/-/object-schema-1.2.1.tgz"
SRC_URI[md5sum] = "c578e603a7be5bd1c1118d8fd864ad4d"
SRC_URI[sha256sum] = "f718df3849bc11e8d6b8b65065ff0d9e42f5935eab4318d32218fd3fe73e17c0"

NPM_PKGNAME = "@humanwhocodes/object-schema"

inherit npmhelper
inherit native
