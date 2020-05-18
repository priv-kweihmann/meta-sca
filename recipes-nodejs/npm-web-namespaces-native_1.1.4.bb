SUMMARY = "NPM: web-namespaces"
DESCRIPTION = "Map of web namespaces"
HOMEPAGE = "https://github.com/wooorm/web-namespaces#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/web-namespaces/-/web-namespaces-1.1.4.tgz"
SRC_URI[md5sum] = "26e8e09d3defe2181ed742d5812dd33c"
SRC_URI[sha256sum] = "dbc9888aa3b292184ea4ef9fdbe405309fb076333ca5ec96acaef5573d4b5d5a"

NPM_PKGNAME = "web-namespaces"

inherit npmhelper
inherit native
