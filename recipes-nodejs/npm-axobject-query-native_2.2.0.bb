SUMMARY = "NPM: axobject-query"
DESCRIPTION = "Programmatic access to information about the AXObject Model"
HOMEPAGE = "https://github.com/A11yance/axobject-query#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cadce3caaeb4d7ea5e8c0e57d5f3d1e7"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axobject-query/-/axobject-query-2.2.0.tgz"
SRC_URI[md5sum] = "c93cfb972eaca434d2fdef06e6ab3356"
SRC_URI[sha256sum] = "d8ac119b6cca5ddceaa9c0d6c536c9fcc4c941fbb2404fd5278b326df32cad04"

NPM_PKGNAME = "axobject-query"

inherit npmhelper
inherit native
