SUMMARY = "NPM: no-cliches"
DESCRIPTION = "Find clichés in your writings"
HOMEPAGE = "https://github.com/duereg/no-cliches"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb98331e7034b98598f6123ab09dd002"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/no-cliches/-/no-cliches-0.3.4.tgz"
SRC_URI[md5sum] = "6ff3bb7a6f3cff431764cd096e2319bc"
SRC_URI[sha256sum] = "1e5891ad9d6b869ef0f9117db691f33af0f84d7e129d8c7d5cdcd1f94bc3fe29"

NPM_PKGNAME = "no-cliches"

inherit npmhelper
inherit native
