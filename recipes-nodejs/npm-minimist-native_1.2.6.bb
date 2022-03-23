SUMMARY = "NPM: minimist"
DESCRIPTION = "parse argument options"
HOMEPAGE = "https://github.com/substack/minimist"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/minimist/-/minimist-1.2.6.tgz"
SRC_URI[md5sum] = "0d781b9eda1d585527fb8e1edcfce4c6"
SRC_URI[sha256sum] = "49c9124665fc1900e589be610b8dc69d5e61a179e9ed8547c6d61d30a225e726"

NPM_PKGNAME = "minimist"

inherit npmhelper
inherit native
