SUMMARY = "NPM: axobject-query"
DESCRIPTION = "Programmatic access to information about the AXObject Model"
HOMEPAGE = "https://github.com/A11yance/axobject-query#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cadce3caaeb4d7ea5e8c0e57d5f3d1e7"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axobject-query/-/axobject-query-3.0.1.tgz"
SRC_URI[md5sum] = "0b785e413c3b7ac958037196a77a0262"
SRC_URI[sha256sum] = "6eb45645bdc9e0594df9d2f88704c91034a6afd05487300a91156a1c5685bd57"

NPM_PKGNAME = "axobject-query"

inherit npmhelper
inherit native
