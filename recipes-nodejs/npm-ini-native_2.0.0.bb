SUMMARY = "NPM: ini"
DESCRIPTION = "An ini encoder/decoder for node"
HOMEPAGE = "https://github.com/isaacs/ini#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ini/-/ini-2.0.0.tgz"
SRC_URI[md5sum] = "380b01c56e0c2ddabe5b16c17f94e2df"
SRC_URI[sha256sum] = "9f724381c23bf8cf5401cbbbc1752d4604f482112f06aef56a4be1861f515990"

NPM_PKGNAME = "ini"

inherit npmhelper
inherit native
