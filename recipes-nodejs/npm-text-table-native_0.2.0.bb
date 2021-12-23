SUMMARY = "NPM: text-table"
DESCRIPTION = "borderless text tables with alignment"
HOMEPAGE = "https://github.com/substack/text-table"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1"

SRC_URI = "https://registry.npmjs.org/text-table/-/text-table-0.2.0.tgz"
SRC_URI[md5sum] = "4e595139988957453229d6ccd229f626"
SRC_URI[sha256sum] = "d883f6704c060373991701894931dd859f73938dd159c66092247a403f88c772"

NPM_PKGNAME = "text-table"

inherit npmhelper
inherit native
